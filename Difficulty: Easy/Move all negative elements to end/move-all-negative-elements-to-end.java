// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int[] temp = new int[n];
        int index =0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                temp[index++] = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[index++] = arr[i];
            }
        }
        System.arraycopy(temp,0,arr,0,n);
    }
}