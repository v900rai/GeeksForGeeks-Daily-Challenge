//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
        int t;
    	t=sc.nextInt();
    	sc.nextLine();
    	while((t--)!=0){
    	    int n=sc.nextInt();
    	    sc.nextLine();
    	    String s = new String();
    	    s=sc.nextLine();
    	    Solution obj = new Solution();
    	    System.out.println(obj.binarySubstring(n, s));
    	
System.out.println("~");
}
	}
}
// } Driver Code Ends




class Solution {

    // Function to count the number of substrings that start and end with '1'
    public static int binarySubstring(int a, String str) {
        int countOne = 0;

        // Count how many times '1' occurs in the string
        for (char ch : str.toCharArray()) {
            if (ch == '1') {
                countOne++;
            }
        }

        // The number of substrings that start and end with '1' is:
        // nC2 = n*(n-1)/2 where n is the count of '1's
        return (countOne * (countOne - 1)) / 2;
    }
}
