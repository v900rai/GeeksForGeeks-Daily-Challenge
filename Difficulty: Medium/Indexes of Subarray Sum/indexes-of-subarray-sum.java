
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int sum = 0;
        int i =0;
        

        for (int j = 0; j < n; j++) {
          sum+=arr[j];

            // अगर currentSum टारगेट से बड़ा हो जाता है, तो शुरुआत से घटाएं
            while (sum > target && i < j) {
                sum =sum - arr[i];
                i++;
            }

            // अगर currentSum टारगेट के बराबर हो जाए
            if(sum == target) {
                result.add(i + 1); // 1-आधारित इंडेक्सिंग के लिए
                result.add(j + 1);
                return result;
                
            }
        }

        // अगर कोई ऐसा सबअरे नहीं मिलता
        result.add(-1);
        return result;
        
       
        }
    
}
