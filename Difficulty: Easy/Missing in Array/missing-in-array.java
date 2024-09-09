//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {
    int missingNumber(int n, int arr[]) {
        // Calculate the expected sum of first n natural numbers
        int total = n * (n + 1) / 2; // Using the formula for the sum of the first n natural numbers
        int sum = 0;

        // Calculate the sum of the elements in the array
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        // The missing number is the difference between the expected total and the actual sum
        return total - sum;
    }
}
