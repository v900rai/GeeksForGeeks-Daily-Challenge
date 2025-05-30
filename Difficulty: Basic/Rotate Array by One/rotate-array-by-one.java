

// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        /*
        int n = arr.length;
        for (int i=0; i<n; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }*/
        int i = 0, j = arr.length - 1;
        
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
}