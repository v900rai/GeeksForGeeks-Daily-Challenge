//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
   public void sort012(int[] arr) {
    int left=0;
    int right=arr.length-1;
    int mid=0;
    while (mid <= right) {
        if (arr[mid] == 0) {
            // Swap arr[left] and arr[mid]
            int temp = arr[left];
            arr[left] = arr[mid];
            arr[mid] = temp;
            left++;
            mid++;
        } else if (arr[mid] == 1) {
            // Move mid forward
            mid++;
        } else if (arr[mid] == 2) {
            // Swap arr[mid] and arr[right]
            int temp = arr[mid];
            arr[mid] = arr[right];
            arr[right] = temp;
            right--;
        }
    }
}


}


        
    



//{ Driver Code Starts.
// } Driver Code Ends