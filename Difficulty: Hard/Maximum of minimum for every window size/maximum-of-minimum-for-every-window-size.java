//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String line = sc.nextLine();
            String[] input = line.split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            Solution solution = new Solution();
            ArrayList<Integer> result = solution.maxOfMins(arr);
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends



class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];  // Previous Smaller Element (PSE)
        int[] right = new int[n]; // Next Smaller Element (NSE)
        int[] res = new int[n + 1]; // Window Size के लिए Result Array
        
        Stack<Integer> stack = new Stack<>();
        
        // **Step 1: Calculate Previous Smaller Element (PSE)**
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear(); // Stack को फिर से उपयोग करने के लिए clear कर देते हैं

        // **Step 2: Calculate Next Smaller Element (NSE)**
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // **Step 3: Calculate Window Size and Fill Results**
        for (int i = 0; i < n; i++) {
            int windowSize = right[i] - left[i] - 1;
            res[windowSize] = Math.max(res[windowSize], arr[i]);
        }

        // **Step 4: Fill Empty Values with Right Maximum**
        for (int i = n - 1; i >= 1; i--) {
            res[i] = Math.max(res[i], res[i + 1]);
        }

        // **Convert Result to ArrayList**
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(res[i]);
        }
        
        return result;
    }

    /*public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {10, 20, 30, 50, 10, 70, 30};
        System.out.println(sol.maxOfMins(arr)); // Output: [70, 30, 20, 10, 10, 10, 10]
    }*/
}
