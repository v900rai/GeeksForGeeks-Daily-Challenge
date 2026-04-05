class Solution {
    public int totalWays(int[] arr, int target) {
        
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        // invalid cases
        if ((target + totalSum) % 2 != 0 || Math.abs(target) > totalSum) {
            return 0;
        }
        
        int subsetSum = (target + totalSum) / 2;
        
        // DP array
        int[] dp = new int[subsetSum + 1];
        dp[0] = 1;
        
        for (int num : arr) {
            for (int i = subsetSum; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        
        return dp[subsetSum];
    }
}