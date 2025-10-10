class Solution {
    static int squaresInMatrix(int m, int n) {
        // code here
        int sum=0;
        if(m==0 && n==0){
            return 0;
        }
        else{
            while(m>=1 && n>=1){
                sum+=m*n;
                m--;
                n--;
            }
        }
        return sum;
    }
};
