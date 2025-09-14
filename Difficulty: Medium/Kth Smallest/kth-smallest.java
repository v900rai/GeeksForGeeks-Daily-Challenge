// User function Template for Java

// Importing required classes
import java.util.*;

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Create a Max-Heap (PriorityQueue with reverseOrder)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Iterate through all elements in the array
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);  // Add element to max-heap

            // If heap size exceeds k, remove the largest element
            // This ensures heap always contains k smallest elements
            if (pq.size() > k) {
                pq.remove();
            }
        }

        // After loop ends, root of max-heap is kth smallest element
        return pq.peek();
    }
}

