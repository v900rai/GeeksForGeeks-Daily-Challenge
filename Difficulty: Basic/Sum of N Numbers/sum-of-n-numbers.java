//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends

//User function Template for Java

public static int nSum(int n){
  int sum=0;
  for(int i=1; i<=n; i++){
      sum=sum+i;
  }
  return sum;
   
}


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = nSum(n);
            System.out.println(ans);
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends