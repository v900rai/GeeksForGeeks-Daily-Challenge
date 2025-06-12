class Solution {

    // Main function to find minimum eating speed
    public int kokoEat(int[] arr, int k) {
        int low = 1; // Minimum possible speed
        int high = Integer.MIN_VALUE;

        // Find the maximum number in arr to set the upper bound of binary search
        for (int i = 0; i < arr.length; i++) {
            high = Math.max(high, arr[i]);
        }

        // Binary Search for the smallest possible speed
        while (low <= high) {
            int mid = (low + high) / 2;
            int hoursNeeded = countBanana(arr, mid); // Total hours needed at speed `mid`

            if (hoursNeeded <= k) {
                // Can try to minimize further
                high = mid - 1;
            } else {
                // Need to eat faster
                low = mid + 1;
            }
        }

        return low; // Smallest valid speed
    }

    // Helper method to calculate total hours needed for given eating speed `val`
    public int countBanana(int[] arr, int val) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // Each pile takes ceil(arr[i] / val) hours
            count += (int)Math.ceil((double)arr[i] / val);
        }

        return count;
    }
}
