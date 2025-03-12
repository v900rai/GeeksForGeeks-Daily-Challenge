//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

//User function Template for Java

public static void utility(int x){
   
   int i=0;
   while(i<=x){
       System.out.print(x-i +" ");
       i++;
   }
   
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int x = scn.nextInt();
            utility(x);
            System.out.println();
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends