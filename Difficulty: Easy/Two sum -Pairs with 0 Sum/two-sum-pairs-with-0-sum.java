

// User function Template for Java
class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        HashSet<String> h=new HashSet<>();
        int left=0;
        int right=arr.length-1;
        
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<0){
                left++;
            }else if(sum>0){
                right--;
            }else{
                String s=arr[left]+","+arr[right];
                if(!h.contains(s)){
                
                    ArrayList<Integer> t=new ArrayList<>();
                    t.add(arr[left]);
                    t.add(arr[right]);
                    res.add(t);
                    h.add(s);
                }
                right--;
                left++;
            }
        }
        return res;
    }
}



