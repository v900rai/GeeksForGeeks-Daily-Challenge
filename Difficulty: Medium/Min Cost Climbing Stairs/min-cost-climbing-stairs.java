//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = str.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            int res = sln.minCostClimbingStairs(arr);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n=cost.length,dp[]=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(rec(0,cost,dp),rec(1,cost,dp));
    }
    private static int rec(int idx,int cost[],int dp[]){
        if(idx>=cost.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int one=cost[idx]+rec(idx+1,cost,dp);
        int two=cost[idx]+rec(idx+2,cost,dp);
        return dp[idx]=Math.min(one,two);
    }
}