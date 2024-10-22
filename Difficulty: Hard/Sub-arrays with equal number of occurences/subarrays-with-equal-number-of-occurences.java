//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends
// User function Template for Java

import java.util.HashMap;

class Solution {
    
    static int sameOccurrence(int arr[], int x, int y) {
        // To keep track of the difference between the counts of x and y
        int diff = 0;
        // HashMap to store the frequency of each prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize map with a base case
        map.put(0, 1);
        
        int result = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // Increment diff for occurrences of x, decrement for y
            if (arr[i] == x) {
                diff += 1;
            } else if (arr[i] == y) {
                diff -= 1;
            }
            
            // If the current diff is found in the map, it means there's a subarray
            // where the occurrences of x and y are the same
            if (map.containsKey(diff)) {
                result += map.get(diff);
            }
            
            // Update the map with the current diff
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }
        
        return result;
    }
/*
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 2, 1, 1, 2};
        int x = 1, y = 2;
        
        System.out.println(sameOccurrence(arr, x, y)); // Output will be the count of subarrays
    }*/
}


//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.sameOccurrence(arr, x, y);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends