//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
// } Driver Code Ends

//User function Template for Java

public static void utility(int n){

    //just complete below statement
   int y = Math.abs(n);
    //just complete below statement
    int ans = y%10;

    //below statement print the result
    System.out.println(ans);
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            utility(n);
        }
        scn.close();
    }
}
// } Driver Code Ends