// User function Template for Java

class Solution {

    public ArrayList<Integer> findMean(int arr[], int q[]) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] dp = new int[arr.length+1];
        
        for(int i=0; i<arr.length; i++) {
            dp[i+1] = dp[i] + arr[i];
        }
        
        for(int i=0; i<q.length - 1; i+=2) {
            int l = q[i];
            int r = q[i+1];
            
            int sum = dp[r+1] - dp[l];
            sum /= (r - l + 1);
            ans.add(sum);
        }
        
        return ans;
    }
}
