
class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int n = arr.length;
        Map<Integer, Integer> m = new   HashMap<>();
        for (int i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        int d = n/k;
        int count = 0;
        for (int i : m.keySet()) {
            if (m.get(i) > d) {
                count++;
            }
        }
        return count;
    }
}

