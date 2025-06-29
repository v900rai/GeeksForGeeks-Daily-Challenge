// User function Template for Java

class Solution {
    private static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    static int palPartition(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        dp[n]=-1;
        for(int i=n-1;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    int cost=1+dp[j+1];
                    min=Math.min(min,cost);         
                }
            }
            dp[i]= min;
        }
        return dp[0];
    }
}