//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java



class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // Result list to store the pair
        List<Integer> result = new ArrayList<>();
        
        // Base case: if the array has fewer than 2 elements
        if (arr == null || arr.length < 2) {
            return result;
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        int start = 0;
        int end = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int minDifference = Integer.MAX_VALUE;
        
        while (start < end) {
            int sum = arr[start] + arr[end];
            int difference = Math.abs(target - sum);
            
            // Update closest sum if a closer difference is found
            if (difference < minDifference) {
                minDifference = difference;
                closestSum = sum;
                result.clear(); // Clear previous results
                result.add(arr[start]);
                result.add(arr[end]);
            }
            
            // Adjust pointers
            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        
        return result;
    }
}
