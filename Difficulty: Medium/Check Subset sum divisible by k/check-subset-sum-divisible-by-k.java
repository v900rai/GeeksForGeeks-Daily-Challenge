class Solution {
    public boolean divisibleByK(int[] arr, int k) {

        if (arr.length >= k)
            return true;

        boolean[] dp = new boolean[k];

        for (int num : arr) {

            boolean[] next = dp.clone();

            next[num % k] = true;

            for (int rem = 0; rem < k; rem++) {
                if (dp[rem]) {
                    next[(rem + num) % k] = true;
                }
            }

            dp = next;

            if (dp[0])
                return true;
        }

        return false;
    }
}