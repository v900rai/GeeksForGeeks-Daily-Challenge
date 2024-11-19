//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int breakPoint = -1;

        // Step 1: Find the rightmost index where arr[i] < arr[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        // Step 2: If no such index exists, reverse the entire array
        if (breakPoint == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the smallest number greater than arr[breakPoint] to the right
        for (int i = n - 1; i > breakPoint; i--) {
            if (arr[i] > arr[breakPoint]) {
                // Swap arr[i] and arr[breakPoint]
                int temp = arr[i];
                arr[i] = arr[breakPoint];
                arr[breakPoint] = temp;
                break;
            }
        }

        // Step 4: Reverse the suffix starting from breakPoint + 1
        reverse(arr, breakPoint + 1, n - 1);
    }

    // Helper method to reverse a portion of the array
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}



//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends