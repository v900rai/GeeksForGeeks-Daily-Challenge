//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // Separate positive and negative numbers into different lists
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        // Traverse the original array and categorize numbers
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        // Alternately merge positive and negative numbers into the original array
        int posIndex = 0, negIndex = 0;
        int i = 0;
        
        while (posIndex < positive.size() && negIndex < negative.size()) {
            if (i % 2 == 0) {
                arr.set(i++, positive.get(posIndex++));
            } else {
                arr.set(i++, negative.get(negIndex++));
            }
        }
        
        // If there are remaining positive numbers, add them to the array
        while (posIndex < positive.size()) {
            arr.set(i++, positive.get(posIndex++));
        }
        
        // If there are remaining negative numbers, add them to the array
        while (negIndex < negative.size()) {
            arr.set(i++, negative.get(negIndex++));
        }
    }
}
