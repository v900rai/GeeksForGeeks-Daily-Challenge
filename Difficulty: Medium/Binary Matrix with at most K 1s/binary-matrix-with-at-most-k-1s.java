class Solution {
    static ArrayList<Integer> largestSquare(ArrayList<ArrayList<Integer>> M, int R, int C, int K, int Q, int[] q_i, int[] q_j) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int dp[][]=new int[R+1][C+1];
        for(int i=0;i<=R;i++){
            int prefix=0;
            for(int j=0;j<=C;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                    continue;
                }
                prefix+=M.get(i-1).get(j-1);
                dp[i][j]=prefix+dp[i-1][j];
            }
        }
        for(int i=0;i<Q;i++){
            int curr=0,low=0,high=Math.min(q_i[i],Math.min(q_j[i],Math.min(C-q_j[i]-1,R-q_i[i]-1)));
            while(low<=high){
                int mid=low+(high-low)/2;
                int row1=q_i[i]-mid;
                int col1=q_j[i]-mid;
                int row2=q_i[i]+mid;
                int col2=q_j[i]+mid;
                if(row1<0 || col1<0 || row2>=R || col2>=C)
                break;
                int bottom=dp[row2+1][col2+1];
                int up=dp[row1][col2+1];
                int left=dp[row2+1][col1];
                int topleft=dp[row1][col1];
                if(bottom-up-left+topleft>K){
                    high=mid-1;
                }
                else{
                    curr=2*mid+1;
                    low=mid+1;
                }
            }
            ans.add(curr);
        }
        return ans;
    }
};

