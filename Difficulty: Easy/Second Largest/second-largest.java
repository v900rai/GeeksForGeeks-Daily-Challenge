class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large=-1;
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        int seclarge=-1;
        for(int j=0;j<arr.length;j++){
                if(seclarge<arr[j] && arr[j]!=large){
                    seclarge=arr[j];
                }
            }return seclarge;
        }
}