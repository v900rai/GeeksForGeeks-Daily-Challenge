class Solution {
    public boolean divby13(String s) {
        if (s == null || s.isEmpty()) {
            return false; // Or throw an IllegalArgumentException, depending on desired behavior for invalid input.
        }

        int remainder = 0;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // Handle non-digit characters in the string
            }
            int digit = c - '0'; // Convert char digit to int
            remainder = (remainder * 10 + digit) % 13;
        }

        return remainder == 0;
    }
}