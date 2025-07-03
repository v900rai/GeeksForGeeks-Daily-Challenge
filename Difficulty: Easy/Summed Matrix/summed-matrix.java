// User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        
        long l=0;
        
        if(q==1 || q>(n+n)){
            return l; // edge cases
        }
        
        if(q<n+1){
            l = q-1; //n-n+q-1
            return l;
        }
        else if(q>=n+1){
            l = n+n-q+1;
            return l;
        }
        
        return l;
    }
}