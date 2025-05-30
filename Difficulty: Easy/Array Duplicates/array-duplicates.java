



class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length-1;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            if(arr[i]==arr[i+1]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
