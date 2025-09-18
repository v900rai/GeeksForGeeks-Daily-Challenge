import java.util.ArrayList;

class Solution {
    // Function to remove duplicates from the given sorted array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Step 1: Add first element (it will always be unique)
        result.add(arr[0]);
        
        // Step 2: Compare each element with previous one
        for (int i = 1; i < arr.length; i++) {
            // If current element is different from previous, add to result
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        return result;
    }
}
