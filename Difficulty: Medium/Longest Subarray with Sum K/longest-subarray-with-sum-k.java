



// User function Template for Java


class Solution {
    public int longestSubarray(int[] arr, int K) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // अगर prefixSum खुद K है, तो subarray [0...i] valid है
            if (prefixSum == K) {
                maxLength = i + 1;
            }

            // Check if (prefixSum - K) exists in the map
            if (prefixSumMap.containsKey(prefixSum - K)) {
                int prevIndex = prefixSumMap.get(prefixSum - K);
                maxLength = Math.max(maxLength, i - prevIndex);
            }

            // Store the prefixSum if it is not already in the map
            if (!prefixSumMap.containsKey(prefixSum)) {
                prefixSumMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}

