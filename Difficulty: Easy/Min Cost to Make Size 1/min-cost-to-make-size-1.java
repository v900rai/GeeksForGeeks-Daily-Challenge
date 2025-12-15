// User function Template for Java
class Solution {
   public int cost(int[] arr) {
        // code here
        // int maxel = Integer.MIN_VALUE;
        int minel = Integer.MAX_VALUE;
        if(arr.length == 1 || arr.length == 0) {
            return 0;
        }
        for(int i = 0; i < arr.length; i++) {
            if(minel > arr[i]) {
                minel = arr[i];
            }
        }
        return (minel*(arr.length-1));
    }
}