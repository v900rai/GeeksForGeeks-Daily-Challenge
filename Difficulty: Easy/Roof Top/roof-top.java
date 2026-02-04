

class Solution {
    // Function to find the maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        int ans = 0;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;  // Increase count when the altitude increases
            } else {
                ans = Math.max(count, ans);  // Update the maximum if needed
                count = 0;  // Reset count after no increase
            }
        }
        // In case the last steps are increasing, update the maximum
        ans = Math.max(ans, count);

        return ans;
    }
}
