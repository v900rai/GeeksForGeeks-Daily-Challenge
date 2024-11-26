//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends



    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
  
class Solution {
    // Function to find the maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;

        int maxKadane = kadane(arr);

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int minSubarraySum = -kadane(arr);

        for (int i = 0; i < n; i++) {
            arr[i] = -arr[i];
        }

        int maxCircular = totalSum - minSubarraySum;

        if (maxCircular == 0) {
            return maxKadane;
        }

        return Math.max(maxKadane, maxCircular);
    }

    private int kadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : arr) {
            sum = Math.max(num, sum + num);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
