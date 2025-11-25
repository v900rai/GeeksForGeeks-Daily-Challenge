

// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int rem;
        int temp; 
        int sum = 0;
        temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);  // rem^3
            n = n / 10;
        }
        return temp == sum;
    }
}