class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        
        
        
        
        ArrayList<Integer> result  = new ArrayList<>();
        int current = 0;
        for(int i=0; i<arr.length; i++){
            current = current + arr[i];
            result.add(current);
        }
        return result;
    }
}