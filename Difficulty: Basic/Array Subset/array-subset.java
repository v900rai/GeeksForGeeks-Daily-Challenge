
import java.util.Arrays;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Step 1: Sort both arrays so that we can use two-pointer technique
        Arrays.sort(a);
        Arrays.sort(b);

        // Step 2: Initialize two pointers for both arrays
        int i = 0; // Pointer for array a
        int j = 0; // Pointer for array b

        // Step 3: Traverse both arrays using two pointers
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                // If elements match, move both pointers
                i++;
                j++;
            } else {
                // If they don't match, move only pointer i (try to find b[j] in a)
                i++;
            }
        }

        // Step 4: If j has reached the end of b, it means all elements of b are found in a
        if (j == b.length)
            return true;  // b[] is a subset of a[]

        // Otherwise, some elements of b[] were not found in a[]
        return false;
    }
}
