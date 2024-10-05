//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.duplicates(arr);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        // Create a frequency array initialized to 0
        int[] frequency = new int[n];

        // Traverse the array and increase the frequency of each element
        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        // Traverse the frequency array to find duplicates
        for (int i = 0; i < n; i++) {
            if (frequency[i] > 1) {
                result.add(i);
            }
        }

        // If no duplicates were found, return -1
        if (result.size() == 0) {
            result.add(-1);
        }

        return result;
    }
}
