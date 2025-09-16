class Solution {
    public boolean isSorted(int[] arr) {
        if(arr.length == 1 || arr.length == 0){
            return true;
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
       return true;
        
    }
}