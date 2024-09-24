//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends



class Solution {
    // Function to find the smallest window in the string s consisting
    // of all the characters of string p.
    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) {
            return "-1";  // If s is smaller than p, no window is possible.
        }

        // Frequency map for characters in string p.
        HashMap<Character, Integer> pMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        // Variables to track the start of the smallest window, its length and count of matched characters.
        int start = 0, minStart = 0, minLength = Integer.MAX_VALUE, matchedCount = 0;
        
        // Frequency map for the sliding window in string s.
        HashMap<Character, Integer> windowMap = new HashMap<>();
        
        // Sliding window expansion.
        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            windowMap.put(endChar, windowMap.getOrDefault(endChar, 0) + 1);

            // If the character is part of p and the window contains enough occurrences of it, count it as matched.
            if (pMap.containsKey(endChar) && windowMap.get(endChar).intValue() <= pMap.get(endChar).intValue()) {
                matchedCount++;
            }

            // Try to minimize the window when all characters are matched.
            while (matchedCount == p.length()) {
                // Update the minimum window length.
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                }

                // Slide the window by removing the start character.
                char startChar = s.charAt(start);
                windowMap.put(startChar, windowMap.get(startChar) - 1);
                if (pMap.containsKey(startChar) && windowMap.get(startChar).intValue() < pMap.get(startChar).intValue()) {
                    matchedCount--;
                }
                start++;  // Move the start pointer forward.
            }
        }

        // If no valid window was found, return "-1".
        return minLength == Integer.MAX_VALUE ? "-1" : s.substring(minStart, minStart + minLength);
    }

    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";
        System.out.println(smallestWindow(s, p));  // Output: "toprac"
    }
}
