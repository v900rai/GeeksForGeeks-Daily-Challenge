class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {

        // ❌ Edge cases:
        // agar k array length se bada hai ya k == 0 hai
        // to koi valid subarray possible nahi
        if (k > arr.length || k == 0) {
            return 0;
        }

        int i = 0;        // 👉 window ka left pointer
        int j = 0;        // 👉 window ka right pointer
        int xor = 0;      // 👉 current window ka XOR
        int max = 0;      // 👉 maximum XOR store karega

        // jab tak right pointer array ke andar hai
        while (j < arr.length) {

            // 👉 right element ko XOR me add karo
            xor = xor ^ arr[j];

            // ❗ agar window ka size k se bada ho gaya
            if (j - i + 1 > k) {
                // 👉 left element ka effect remove karo
                xor = xor ^ arr[i];
                i++; // 👉 left pointer aage badhao
            }

            // ✅ jab window ka size exactly k ho
            if (j - i + 1 == k) {
                // 👉 maximum XOR update karo
                max = Math.max(max, xor);
            }

            // 👉 right pointer aage badhao
            j++;
        }

        // 👉 final maximum XOR return
        return max;
    }
}
