//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution{
public int findTarget(int arr[], int target) {
    int n = arr.length;
    int low = 0, high = n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        // Check if mid is target
        if (arr[mid] == target) return mid;

        // Check left neighbor
        if (mid - 1 >= low && arr[mid - 1] == target) return mid - 1;

        // Check right neighbor
        if (mid + 1 <= high && arr[mid + 1] == target) return mid + 1;

        // Move to the unsorted part
        if (arr[mid] < target) {
            low = mid + 2; // skip mid and mid+1
        } else {
            high = mid - 2; // skip mid and mid-1
        }
    }
    return -1;
}
}


//{ Driver Code Starts.

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            int arr[] = new int[n];
            int target = sc.nextInt();
            if (sc.hasNextLine()) sc.nextLine();
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(temp[i]);
            Solution sln = new Solution();
            int ans = sln.findTarget(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends