class Solution {
    static int pairCubeCount(int n) {
        // code here
        int count = 0;
        for(int a = 1; a <= Math.cbrt(n); a++){
            for(int b = 0; b <=n; b++){
                if(a*a*a + b*b*b == n){
                    count = count + 1;
                }
            }
        }
        return count;
    }
};