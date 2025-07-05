
// class Solution {
//     public int maxSum(int arr[]) {
//         int ans=Integer.MIN_VALUE;
//         for(int i=1;i<arr.length;i++){
//             ans=Math.max(ans,arr[i]+arr[i-1]);
//         }
//         return ans;
//     }
// }
class Solution {
    public int maxSum(int arr[]) {
        // code here
        int n=arr.length;
        int maxSum=0;
        for(int i=0;i<n-1;i++)
        {
            int sum=arr[i]+arr[i+1];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}