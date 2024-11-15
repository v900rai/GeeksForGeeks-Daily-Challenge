//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
      int secondLargest=Integer.MIN_VALUE;
      int firstLargest=Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest; // Update second largest before changing firstLargest
                firstLargest = arr[i]; // Update firstLargest to the new largest value
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i]; // Update second largest if it's not equal to the largest value
            }
        }

        // Handle cases where there is no second largest
        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // Assuming -1 indicates no second largest found
        }

        return secondLargest;
    }
}