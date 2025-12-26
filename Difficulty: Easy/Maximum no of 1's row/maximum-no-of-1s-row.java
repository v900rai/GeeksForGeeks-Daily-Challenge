// User function Template for Java
class Sol {
    public static int maxOnes(int Mat[][], int N, int M) {
        // your code here
        int count=0;
        int f=0;
        int ans=0;
        for(int i=0;i<N;i++){
            count=0;
            for(int j=0;j<M;j++){
               if(Mat[i][j]==1){
                   count++;
               } 
            }
            if(ans<count){
                f=i;
            }
            ans=Math.max(ans,count);
            
        }
        return f;
    }
}

