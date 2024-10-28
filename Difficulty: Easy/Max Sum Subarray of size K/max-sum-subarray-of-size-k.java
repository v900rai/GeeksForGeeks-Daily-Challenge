//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

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

            int k = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            long ans = ob.maximumSumSubarray(arr, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long maximumSumSubarray(int[] arr, int k) {
        int n=arr.length; 
        int maxSum=0;
        int sum=0;
        int i=0;
        int j=0;
        while(j<n){
            sum+=arr[j];
            // check karna h ki vaild h window or not
            if(j-i+1<k){
                // this is not valid window
                j++;
            }
            else if(j-i+1==k){
                //our window size k
                maxSum=Math.max(maxSum, sum);
                // update the next sum
                sum-=arr[i];
                //update the window
                i++;
                j++;
                
            }
        }
        return maxSum;
       
    }
}