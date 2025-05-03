//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

// 
// } Driver Code Ends

// User function Template for Java

/*Class solution with countOddEven() as its member function
 * arr : input array
 */
class Solution {
    public static void countOddEven(Integer arr[]) {

        // Your code here
        int odd = 0, even =0;
        for(int num:arr){
            if(num%2==0)even++;
            else odd++;
        }
        System.out.println(odd +" "+ even);
        
        
    }
}


//{ Driver Code Starts.

class GFG {

    // Driver code
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            // Convert ArrayList to array
            Integer[] arr = new Integer[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call countOddEven method and print result
            ob.countOddEven(arr);
            // System.out.println("~"); // Print separator for different test cases
        
System.out.println("~");
}
        sc.close();
    }
}

// } Driver Code Ends