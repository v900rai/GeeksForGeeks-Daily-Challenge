//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

// User function Template for Java

public static void square(int s) {
   for(int i = 0;i<s;i++)
    {
        for(int j = 0;j<s;j++)
        {
            if(i==0||j==0||j==s-1||i==s-1)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
        System.out.println();


}
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int s = scn.nextInt();
            square(s);

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends