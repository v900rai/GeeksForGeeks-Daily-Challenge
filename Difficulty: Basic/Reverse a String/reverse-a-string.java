//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str = read.readLine();
            System.out.println(new Solution().reverseString(str));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // Reverse 
        
        char ch[] = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
             left++;
            right--;
        }

        return new String(ch);
    }
}
