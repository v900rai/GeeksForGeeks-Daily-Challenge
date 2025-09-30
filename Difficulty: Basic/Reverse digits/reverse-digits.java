

// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum = (sum * 10) + digit;
            n = n / 10;
        }
        return sum;
    }
}