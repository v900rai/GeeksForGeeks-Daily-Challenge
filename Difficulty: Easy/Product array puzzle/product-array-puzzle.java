

// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;

        // Initialize arrays to store the prefix and suffix products
        int[] prefix = new int[n]; // Prefix product array
        int[] suffix = new int[n]; // Suffix product array
        int[] result = new int[n]; // Result array to store final products

        // Compute prefix product for each index
        prefix[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        // Compute suffix product for each index
        suffix[n - 1] = 1; // No elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        // Compute result by multiplying prefix and suffix products for each index
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
/*
    // Main method for testing
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4}; // Example input
        int[] result = productExceptSelf(arr);

        // Print the result array
        System.out.println("Product array: ");
        for (int value : result) {
            System.out.print(value + " ");
        }*/
    
}
