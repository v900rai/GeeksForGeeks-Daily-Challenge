class Solution {
    public int findFloor(int[] arr, int x) {
       for(int i=arr.length-1; i>=0; i--){
           if(arr[i]<=x){
               return i;
           }
       }
       return -1;
        
    }
}
