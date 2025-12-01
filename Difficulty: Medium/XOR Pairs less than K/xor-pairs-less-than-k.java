class Solution {

    // Trie Node for storing bits
    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
        int count = 0;  // how many numbers pass through this node
    }

    TrieNode root = new TrieNode();

    // Insert a number in the Trie
    private void insert(int num) {
        TrieNode node = root;
        for (int i = 15; i >= 0; i--) {   // arr[i] <= 50000 => max 16 bits
            int bit = (num >> i) & 1;
            if (node.child[bit] == null)
                node.child[bit] = new TrieNode();

            node = node.child[bit];
            node.count++;   // increase count for this bit path
        }
    }

    // Count numbers already in trie having XOR < k with num
    private int countLessThanK(int num, int k) {
        TrieNode node = root;
        int total = 0;

        for (int i = 15; i >= 0; i--) {
            if (node == null) break;

            int numBit = (num >> i) & 1;
            int kBit = (k >> i) & 1;

            if (kBit == 1) {
                // If kBit is 1 → we can take all numbers where (numBit XOR bit) == 0
                int sameBit = numBit;

                if (node.child[sameBit] != null)
                    total += node.child[sameBit].count;

                // Now go to branch where XOR becomes 1
                node = node.child[1 - sameBit];

            } else {
                // kBit is 0 → we MUST follow path where XOR stays 0
                node = node.child[numBit];
            }
        }

        return total;
    }

    public int cntPairs(int[] arr, int k) {

        int answer = 0;

        for (int num : arr) {
            // before inserting num, count pairs with previous numbers
            answer += countLessThanK(num, k);
            insert(num);
        }

        return answer;
    }
}
