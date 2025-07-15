

// User function Template for Java



class Solution {
    // Function to merge two sorted arrays without using extra space
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int left = n - 1;  // Pointer at the end of array 'a'
        int right = 0;     // Pointer at the beginning of array 'b'

        // Step 1: Swap elements to make sure all smaller elements are in 'a' and larger in 'b'
        while (left >= 0 && right < m) {
            if (a[left] > b[right]) {
                // If a's element is greater, swap it with b's element
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;
                left--;
                right++;
            } else {
                // If no more swapping needed, exit loop
                break;
            }
        }

        // Step 2: Sort both arrays individually
        Arrays.sort(a);
        Arrays.sort(b);
    }
}


