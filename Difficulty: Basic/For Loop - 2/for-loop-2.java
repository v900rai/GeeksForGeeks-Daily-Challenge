//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

//User function Template for Java

public static void utility(String s){
    // Length of string is given by s.length()
    // character at any index i is given by s.charAt(i)
    
    //Write your code here
     for(int i = 0;i<s.length();i++)
    {
        if(i%2==0)
        {
            System.out.print(s.charAt(i));
        }
    }
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while(t-- > 0) {
            String s = scn.nextLine();
            utility(s);
            System.out.println();
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends