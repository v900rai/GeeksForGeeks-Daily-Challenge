class Solution {
    int maxSubarraySum(int[] arr) {
       int sum=0;
       int max=Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
           sum= sum+arr[i];
           max=Math.max(sum ,max);
           if(sum<0){
               sum=0;
           }
       }
        
        return max;
    }
}
