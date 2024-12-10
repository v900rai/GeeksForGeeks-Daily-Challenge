//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isParenthesisBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
         StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) { 
            if (c == '(' || c == '{' || c == '[') {
                sb.append(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (sb.length() == 0) {
                    return false;
                }
                char last = sb.charAt(sb.length() - 1);
                if ((c == ')' && last != '(') || 
                    (c == '}' && last != '{') ||
                    (c == ']' && last != '[')) {
                    return false;
                }
                sb.setLength(sb.length() - 1);
            }
        }
        return sb.length() == 0;
    }
}
