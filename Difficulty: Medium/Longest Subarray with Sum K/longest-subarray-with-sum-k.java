//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int k = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution();
            int ans = ob.longestSubarray(nums, k); // Call the function and store result
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


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

