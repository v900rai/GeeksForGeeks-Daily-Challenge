
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int sum = 0;
        int start =0;
        

        for (int end = 0; end < n; end++) {
          sum+=arr[end];

            // अगर currentSum टारगेट से बड़ा हो जाता है, तो शुरुआत से घटाएं
            while (sum > target && start < end) {
                sum =sum - arr[start];
                start++;
            }

            // अगर currentSum टारगेट के बराबर हो जाए
            if(sum == target) {
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
