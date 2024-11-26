//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] a = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                a[i] = Integer.parseInt(numsStr[i]);
            }
            line = read.readLine().trim();
            numsStr = line.split(" ");
            int[] b = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                b[i] = Integer.parseInt(numsStr[i]);
            }
            Solution ob = new Solution();
            if (ob.isSubset(a, b))
                System.out.println("Yes");
            else
                System.out.println("No");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public boolean isSubset(int a[], int b[]) {
        Arrays.sort (a) ;
        Arrays.sort (b) ;
        
        int i = 0 ;
        int j = 0 ;
        
        while ( i < a.length && j < b.length){
            
            // if elements are equal then both arrays will move to next
            
            if ( a[i] == b[j]){
                i++ ;
                j++ ;
            }
            
            // if a vali array is smaller 
            
            else if ( a[i] < b[j]){
                i++ ;
                
            }
            else {
                return false ; 
            }
        }
        
        return j == b.length ;
    

    }
}
