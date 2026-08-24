class Solution {
    static int nthFibonacci(int n) {
        // code here
        // base case 
        if(n == 0 || n == 1){
            return n;
        }
        
        int f1= nthFibonacci(n - 1);
        int f2 = nthFibonacci(n - 2);
        int fn = f1 + f2;
        return fn;
    }
}
