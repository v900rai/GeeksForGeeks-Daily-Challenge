//{ Driver Code Starts

// } Driver Code Ends

import java.util.*;

public class Main {
    public static void main(String args[]) {
       Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        int s = 1;
        for(int i = 1;i<=n;i++)
        {
            s *= i;
        }
        System.out.print(s);
        
    }
}


//{ Driver Code Starts.
// } Driver Code Ends