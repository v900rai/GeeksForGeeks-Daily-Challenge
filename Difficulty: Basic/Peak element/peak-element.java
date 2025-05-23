class Solution {

    public int peakElement(int[] arr) {
      
        int n=arr.length;
        int max=0;
        int index=0;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}