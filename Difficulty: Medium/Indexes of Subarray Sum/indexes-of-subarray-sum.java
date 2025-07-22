
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currentSum =currentSum+ arr[end];

            // अगर currentSum टारगेट से बड़ा हो जाता है, तो शुरुआत से घटाएं
            while (currentSum > target && start < end) {
                currentSum =currentSum - arr[start];
                start++;
            }

            // अगर currentSum टारगेट के बराबर हो जाए
            if (currentSum == target) {
                result.add(start + 1); // 1-आधारित इंडेक्सिंग के लिए
                result.add(end + 1);
                return result;
                
            }
        }

        // अगर कोई ऐसा सबअरे नहीं मिलता
        result.add(-1);
        return result;
    }
}
