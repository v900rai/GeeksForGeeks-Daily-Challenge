class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        int prev_prev = 0;
        int prev = 0;
        for(int i=0; i<n; i++){
            int curr = Math.max(prev, prev_prev+arr[i]);
            prev_prev = prev;
            prev = curr;
        }
        return prev;
    }
}