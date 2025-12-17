class Solution {
    public void sort012(int[] arr) {
        // This method sorts an array containing only 0s, 1s, and 2s
        // using the counting method (also called frequency method)

        int count0 = 0; // count of 0s
        int count1 = 0; // count of 1s
        int count2 = 0; // count of 2s

        // Step 1: Count the frequency of 0s, 1s and 2s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;     // increment count of 0s
            } else if (arr[i] == 1) {
                count1++;     // increment count of 1s
            } else {
                count2++;     // increment count of 2s
            }
        }

        // Step 2: Fill the array again based on counts
        int k = 0; // pointer to fill array

        // Fill all 0s
        while (count0 > 0) {
            arr[k] = 0;
            k++;
            count0--;
        }

        // Fill all 1s
        while (count1 > 0) {
            arr[k] = 1;
            k++;
            count1--;
        }

        // Fill all 2s
        while (count2 > 0) {
            arr[k] = 2;
            k++;
            count2--;
        }
    }
}
