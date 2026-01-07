class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int maxProduct = arr[0];
        int currentMax = arr[0];
        int currentMin = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            
            // it is a very good 
            currentMax = Math.max(arr[i], currentMax * arr[i]);
            currentMin = Math.min(arr[i], currentMin * arr[i]);
            
            maxProduct = Math.max(maxProduct, currentMax);
            
            
        }
        
        return maxProduct;
    }
}