// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
           // Your code here
        int[] ans=new int[n];
        ans[0]=0;
        if(n==1) return ans;
        ans[1]=1;
        if(n==2) return ans;
        for(int i=2;i<n;i++) ans[i]=ans[i-1]+ans[i-2];
        return ans;
    }
}