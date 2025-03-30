//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String S = read.readLine().trim();

            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);

            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java


class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        char prev ='\0';
        for(char ch : s.toCharArray()) {
            if(ch!=prev) {
                
            sb.append(ch);
        }
        prev = ch;
    }
        
        return sb.toString();
    }
}