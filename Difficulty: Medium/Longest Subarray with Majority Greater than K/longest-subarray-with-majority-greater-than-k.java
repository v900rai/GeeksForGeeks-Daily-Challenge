//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    static int longestSubarray(int[] arr, int k) {
	   int[] change = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>k) {
            	change[i]=1;
            }
            else {
            	change[i]=-1;
            }
        }
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, -1);        
        int maxLength = 0;

        for (int i = 0; i < change.length; i++) {
            prefixSum += change[i];
            if (prefixSum > 0) {
                maxLength = Math.max(maxLength, i + 1);
            } else {
                if (prefixMap.containsKey(prefixSum - 1)) {
                    maxLength = Math.max(maxLength, i - prefixMap.get(prefixSum - 1));
                }
            }
            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }
        return maxLength;
	}
}


//{ Driver Code Starts.

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");
            int n = tokens.length;
            int[] arr = new int[n];

            int i = 0;
            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                arr[i] = Integer.parseInt(token);
                i++;
            }

            int k = Integer.parseInt(br.readLine().trim());
            System.out.println(new Solution().longestSubarray(arr, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends