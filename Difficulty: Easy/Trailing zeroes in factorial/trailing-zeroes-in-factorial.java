class Solution{
    static int trailingZeroes(int N){
        // Write your code here
        int count=0;
        while (N>=5){
            N=N/5;
            count=count+N;
        }
        return count;
    }
}

