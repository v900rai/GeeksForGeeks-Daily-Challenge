class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i=0, j= 0, sum = 0, max = Integer.MIN_VALUE;
        
        while(j < arr.length){
                sum += arr[j];
            if(j-i+1 == k){
                max = Math.max(sum, max);
                sum -= arr[i];
                i++;
            }
             j++;
        }
        return max;
    }
}

