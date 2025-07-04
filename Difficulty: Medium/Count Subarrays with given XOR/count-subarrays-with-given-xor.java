


class Solution {
    public long subarrayXor(int arr[], int k) {
        int n = arr.length;
        long count = 0;
        int xor = 0;

        // HashMap to store the frequency of prefix XORs
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            xor ^= num;

            // Check if the current XOR itself equals k
            if (xor == k) {
                count++;
            }

            // Check if there exists a prefix XOR such that prefixXOR ^ k = current XOR
            int required = xor ^ k;
            count += freq.getOrDefault(required, 0);

            // Add the current XOR to the HashMap
            freq.put(xor, freq.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
