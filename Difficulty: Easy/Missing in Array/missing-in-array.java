//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




// User function Template for Java


class Solution {
    int missingNumber(int arr[]) {
        int m = arr.length + 1; // Total numbers expected (including the missing one)
        long sum = (long)m * (m + 1) / 2; // Sum of the first m natural numbers
        for (int i = 0; i < arr.length; i++) { // Iterate over the array
            sum -= arr[i];
        }
        return (int) sum; // The remaining sum is the missing number
    }
}
