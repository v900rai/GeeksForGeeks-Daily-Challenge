//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.kthMissing(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    public int kthMissing(int[] arr, int k) {
        // Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Perform binary search
        while (start <= end) {
            int mid = (start + end) / 2;
            int missing = arr[mid] - mid - 1;

            if (missing < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Return the k-th missing number
        return k + start;
    }
}
