// User function Template for Java

class Solution {
    int[][] rotateMatrix(int m, int n, int Mat[][]) {
        // code here
        int i=0;
        int j=0;
       int x=0;
        int M=m;
        int N=n;
        int count=0;
      while(i<M-1 && j<N-1)
        {
            int temp=Mat[i][j];
            for( j=j+1;j<N;j++)
            {
                x=Mat[i][j];
                Mat[i][j]=temp;
                temp=x;
                
            }
            j=N-1;
            for( i=i+1;i<M;i++)
            {
                x=Mat[i][j];
                Mat[i][j]=temp;
                temp=x;
            }
            i=M-1;
            for(j=N-2;j>=n-N;j--)
            {
               x=Mat[i][j];
               Mat[i][j]=temp;
               temp=x; 
            }
            j=n-N;
            for(i=M-2;i>=m-M;i--)
            {
                x=Mat[i][j];
               Mat[i][j]=temp;
               temp=x; 
            }
            M=M-1;
            N=N-1;
            count=count+1;
            i=count;
            j=count;
           
        }
        return Mat;
    }
}