class Solution {
    public static boolean prime(int n) {
        // Write your code here
          if (n == 2) {
            return true;
        } else if (n == 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
            return true; 
    }
}