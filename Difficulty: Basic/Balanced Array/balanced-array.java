//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        for (int k = 0; k < t; k++) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr.add(lineScanner.nextInt());
            }
            lineScanner.close();

            Solution ob = new Solution();
            int ans = ob.minValueToBalance(arr);
            System.out.println(ans);
        
System.out.println("~");
}

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java



class Solution {
    // Function to find the minimum value required to balance the array
    public int minValueToBalance(List<Integer> arr) {
        int n = arr.size();
        int leftSum = 0, rightSum = 0;

        // Calculate sum of the left half
        for (int i = 0; i < n / 2; i++) {
            leftSum += arr.get(i);
        }

        // Calculate sum of the right half
        for (int i = n / 2; i < n; i++) {
            rightSum += arr.get(i);
        }

        // Return the absolute difference
        return Math.abs(leftSum - rightSum);
    }
/*
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> arr = List.of(1, 2, 1, 2, 1, 3);
        System.out.println(solution.minValueToBalance(arr)); // Output: 2
    }*/
}
