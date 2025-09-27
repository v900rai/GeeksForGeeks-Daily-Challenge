class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int zero = 0;
        int one =0;
        int max=0;
        for(int n:arr){
            if(n==0){
                zero++;
                one=0;
            }
            if(n==1){
                one++;
                zero=0;
            }
            max=Math.max(max,Math.max(zero, one));
        }
        return max;
        
    }
}
