class Solution {
    static int closest3Sum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int closestSum = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(currentSum - target);

                // Update the closest sum if needed
                if (diff < minDiff || (diff == minDiff && currentSum > closestSum)) {
                    closestSum = currentSum;
                    minDiff = diff;
                }

                // Move pointers
                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
};
