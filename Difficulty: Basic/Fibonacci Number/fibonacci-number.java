class Solution {
    public static int fibonacci(int n) {
        // Write your code here to calculate
        // to calculate the nth fibonacci number
          if(n ==0) return 0;
        if(n==1) return 1;
        
        return fibonacci(n-1) + fibonacci(n-2);
        
    }
}
