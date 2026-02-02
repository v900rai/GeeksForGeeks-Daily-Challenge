class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // Create a HashMap to store prefix sums and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0; // This will store the number of valid subarrays
        int sum = 0; // This keeps track of the running sum (prefix sum)

        // Initialize map with (0, 1) to handle cases where subarray starts from index 0
        // This means a sum of 0 has occurred once before we start
        map.put(0, 1); 

        // Iterate through each number in the array
        for (int num : arr) {
            // Add current number to the running sum
            sum += num;

            // Check if (sum - k) exists in the map
            // If it does, it means there are subarrays ending at current index
            // that sum to k
            if (map.containsKey(sum - k)) {
                // Add the number of times (sum - k) has occurred to count
                count += map.get(sum - k);
            }

            // Update the map with current sum
            // If sum already exists, increment its count
            // Otherwise, add it with count 1
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}