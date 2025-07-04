
class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();// Min-heap by default
        int i=0;
        while(i<k) {// Add the first k elements to the priority queue
            pq.add(arr[i]);
            i++;
        }  // Process the remaining elements in the array
        while(i<arr.length){ 
            if(arr[i]> pq.peek()){
            pq.poll() ;// Remove the smallest element
            pq.add(arr[i]);  // Add the current element
            } //logic to finding the max numbers in min-max pq
            i++;
        }
    ArrayList<Integer> list = new ArrayList<>(pq);  // Convert the PriorityQueue to an ArrayList
    Collections.sort(list, Collections.reverseOrder());// Sort in descending order
    return list;
    }
}

