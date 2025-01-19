//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean ans = ob.isDigitSumPalindrome(N);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
          int num = n ;
        int ans = 0;
        while(num>0){
            int rm = num % 10 ;
            ans+=rm;
            num/=10;
        }
         String s = Integer.toString(ans);
        int nu=s.length();
        for(int i=0;i<nu;i++){
            if(s.charAt(i)!=s.charAt(nu-i-1)){
                return false;
    }
}
return true;
}
}
