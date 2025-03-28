//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            // Read the start times
            String[] startInput = reader.readLine().trim().split("\\s+");
            int[] start = new int[startInput.length];
            for (int i = 0; i < startInput.length; i++) {
                start[i] = Integer.parseInt(startInput[i]);
            }

            // Read the end times
            String[] endInput = reader.readLine().trim().split("\\s+");
            int[] finish = new int[endInput.length];
            for (int i = 0; i < endInput.length; i++) {
                finish[i] = Integer.parseInt(endInput[i]);
            }

            // Create solution object and call activitySelection
            Solution obj = new Solution();
            System.out.println(obj.activitySelection(start, finish));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends





class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;

        // Step 1: Activities को {start, finish} pair के रूप में store करना
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[]{start[i], finish[i]};
        }

        // Step 2: Finish time के अनुसार sorting करना (Greedy Strategy)
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        // Step 3: Activity Selection Logic (Greedy Approach)
        int end = -1;  // पिछले चुने गए activity का end time
        int count = 0;  // Non-overlapping activities की संख्या
        
        for (int i = 0; i < n; i++) {
            // यदि वर्तमान activity का start time पिछले चुने गए activity के end time से बड़ा है
            if (arr[i][0] > end) {
                count++;    // इस activity को चुन लेते हैं
                end = arr[i][1];  // नया end time update कर देते हैं
            }
        }

        return count;  // अधिकतम non-overlapping activities की संख्या
    }
}
