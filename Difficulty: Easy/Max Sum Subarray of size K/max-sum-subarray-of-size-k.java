class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int i = 0;
        int j = 0;             // i = window start, j = window end
        int sum = 0;
        int max = Integer.MIN_VALUE; // sum = current window sum, max = final answer
        
        while (j < arr.length) {
            sum += arr[j];  // नया element add कर रहे हैं
            
            if (j - i + 1 == k) {  // जब window का size k हो जाए
                max = Math.max(sum, max);  // max update
                
                sum -= arr[i];  // window से पहला element हटाओ
                i++;            // window को आगे slide करो
            }
            
            j++; // अगले element पर move करो
        }
        return max;
    }
}
