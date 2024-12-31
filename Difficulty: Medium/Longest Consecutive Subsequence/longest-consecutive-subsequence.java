//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    // Function to return the length of the longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            // Check if this is the start of a sequence
            if (!set.contains(arr[i] - 1)) {
                int val = arr[i];
                while (set.contains(val)) {
                    val++;
                }
                ans = Math.max(ans, val - arr[i]);
            }
        }
        return ans;
    }
}
