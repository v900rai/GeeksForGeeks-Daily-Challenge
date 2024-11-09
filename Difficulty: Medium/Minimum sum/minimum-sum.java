//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int a[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            int f = 0;
            String A = obj.minSum(a);
            System.out.println(A);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {
    public String minSum(int[] arr) {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();

        // Convert array to List for easier sorting in Java
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.sort(list);

        // Alternately add digits to form two minimum numbers
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                n1.append(list.get(i));
            } else {
                n2.append(list.get(i));
            }
        }

        // Reverse both strings to prepare for addition from least significant digit
        n1.reverse();
        n2.reverse();

        // Perform digit-by-digit addition of n1 and n2
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0, carry = 0;
        while (i < n1.length() || j < n2.length() || carry != 0) {
            int sum = carry;
            if (i < n1.length()) {
                sum += n1.charAt(i++) - '0';
            }
            if (j < n2.length()) {
                sum += n2.charAt(j++) - '0';
            }
            carry = sum / 10;
            ans.append(sum % 10);
        }

        // Remove any leading zeroes
        while (ans.length() > 1 && ans.charAt(ans.length() - 1) == '0') {
            ans.deleteCharAt(ans.length() - 1);
        }

        // Reverse back to get the final answer
        return ans.reverse().toString();
    }
}

