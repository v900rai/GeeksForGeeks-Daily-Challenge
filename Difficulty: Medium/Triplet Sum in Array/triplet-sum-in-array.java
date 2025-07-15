
// User function Template for Java
class Solution {
    public static boolean hasTripletSum(int arr[], int target) {
        // Step 1: Sort the array to use two-pointer approach
        Arrays.sort(arr);

        // Step 2: Traverse the array
        for (int i = 0; i < arr.length - 2; i++) {
            int k = i + 1; // Start pointer
            int j = arr.length - 1; // End pointer

            // Step 3: Use two-pointer to find if any pair (k, j) with arr[i] sums to target
            while (k < j) {
                int sum = arr[i] + arr[k] + arr[j];

                if (sum == target) {
                    return true; // Triplet found
                } else if (sum < target) {
                    k++; // Move start pointer forward to increase sum
                } else {
                    j--; // Move end pointer backward to decrease sum
                }
            }
        }
        // No such triplet found
        return false;
    }
}
