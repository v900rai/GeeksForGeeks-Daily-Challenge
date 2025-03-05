//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] words = sc.nextLine().trim().split(" ");
            Solution obj = new Solution();
            int res = obj.longestStringChain(words);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    public int longestStringChain(String words[]) {
        Arrays.sort(words, (a, b) -> a.length() - b.length()); // शब्दों को उनकी लंबाई के अनुसार सॉर्ट करें
        
        HashMap<String, Integer> dp = new HashMap<>();
        int maxChain = 1;

        for (String word : words) {
            int best = 1;
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1); // एक अक्षर हटाकर नया शब्द बनाएं
                if (dp.containsKey(prev)) {
                    best = Math.max(best, dp.get(prev) + 1);
                }
            }
            dp.put(word, best);
            maxChain = Math.max(maxChain, best);
        }
        
        return maxChain;
    }
}
