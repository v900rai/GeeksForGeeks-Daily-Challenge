class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int n=nums.length;
        int []prev = new int [target+1];
        prev[0]=1;
        for(int i=1;i<=n;i++){
            int [] curr = new int[target+1];
            for(int j=0;j<=target;j++){
                int take =0;
                if(j>=nums[i-1])take=prev[j-nums[i-1]];
                int nontake = prev[j];
                curr[j]=take+nontake;
            }
            prev=curr;
        }
        return prev[target];
        
    }
   
}