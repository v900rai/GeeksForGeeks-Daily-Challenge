//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    static char nonRepeatingChar(String S) {
        // Character की frequency count करने के लिए HashMap
        Map<Character, Integer> freqMap = new HashMap<>();

        // Step 1: हर character की frequency count करो
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: फिर से traverse करके पहला non-repeating character ढूंढो
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (freqMap.get(ch) == 1) {
                return ch;
            }
        }

        // अगर कोई भी non-repeating character नहीं मिला
        return '$';
    }
}

