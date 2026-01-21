
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList <Integer>  list = new ArrayList<>();
        int n= arr.length;
        int sum =0;
        
        int i=0;
        for(int j=0; j<n; j++){
            sum = sum+arr[j];
            
            while(sum > target && i<j){
                sum = sum-arr[i];
                i++;
            }
            if(sum == target){
                list.add(i+1);
                list.add(j+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
