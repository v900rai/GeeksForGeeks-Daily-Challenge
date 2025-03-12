//{ Driver Code Starts

// } Driver Code Ends

import java.util.*;


public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        
        if(isPrime(N) == 1)
        
            System.out.print("True");
            
        else
        
         System.out.print("False");
        
    }
    
        public static int isPrime(int n){
            
            if(n<=1)
            return 0;
            
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                    return 0;
            }
            return 1;
        }
}
    



//{ Driver Code Starts.
// } Driver Code Ends