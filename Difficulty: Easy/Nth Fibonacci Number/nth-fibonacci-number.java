

// User function Template for Java

/*class Solution {
    public int nthFibonacci(int n) {
       if(n<=1){
           return n;
       }
       return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
*/
class Solution {
    public int nthFibonacci(int n) {
        // code here
       int first = 0;
       int second = 1;
        int result = 0;
        
        if(n==0){
            return first;
        }else if(n==1){
            return second;
        }else{
            for(int i = 2; i <=n; i++){
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }
}