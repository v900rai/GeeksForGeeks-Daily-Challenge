class Solution {
    // Method to check whether a given number 'n' is prime or not
    public static boolean prime(int n) {
        // If n is 2, then it's a prime number (smallest even prime)
        if (n == 2) {
            return true;
        } 
        // If n is 1, then it's not a prime number
        else if (n == 1) {
            return false;
        }

        // Check divisibility from 2 to n/2
        // If n is divisible by any number in this range, it's not prime
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) { // if remainder is 0, means divisible
                return false; // not a prime number
            }
        }

        // If no number divides n completely, then n is prime
        return true; 
    }
}
