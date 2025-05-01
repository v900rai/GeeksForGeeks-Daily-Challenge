//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSingle(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
/*import java.util.HashMap;
import java.util.Map;*/

class Solution {

    // Function to return the element which occurs only once in the array
    public int getSingle(int[] arr) {
        int val = arr[0];  // Default value set to first element
        
        // HashMap banaya jisme key = element aur value = frequency
        Map<Integer, Integer> map = new HashMap<>();

        // Sabhi elements ki frequency count kar rahe hain
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            //map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Jo element sirf 1 baar aaya hai, usse return karenge
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == 1) {
                val = arr[i];
                break; // mil gaya toh loop break kar dena chahiye
            }
        }

        return val;
    }
}
