//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());

        // Process each test case
        while (T-- > 0) {
            // Read the entire line containing the array elements
            String line = br.readLine();

            // Split the line into an array of strings, then parse them as integers
            String[] tokens = line.split("\\s+");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Create the Solution object
            Solution obj = new Solution();

            // Call maxLen function and print the result
            System.out.println(obj.maxLen(a));
        }
    }
}
// } Driver Code Ends




class Solution {
    public int maxLen(int[] arr) {
        // 0 को -1 में बदलें
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        // HashMap to store prefix sum and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Prefix sum
            
            // अगर sum 0 है, तो [0...i] subarray की लंबाई सबसे बड़ी होगी
            if (sum == 0) {
                maxLen = i + 1;
            }

            // अगर sum पहले से HashMap में है
            if (map.containsKey(sum)) {
                // subarray की लंबाई निकालें और maxLen को update करें
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                // अगर sum पहली बार मिला है, तो इसे store करें
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
