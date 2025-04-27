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
        // String को character array में convert किया
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        // दो pointers से characters को swap करते हुए reverse किया
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        // final reversed string को return किया
        return new String(chars);
    }
}
