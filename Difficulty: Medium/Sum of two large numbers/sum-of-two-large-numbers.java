// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
        int i = X.length() - 1, j = Y.length() - 1, carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int n1 = i >= 0 ? X.charAt(i--) - '0' : 0;
            int n2 = j >= 0 ? Y.charAt(j--) - '0' : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        // Remove leading zeros
        String str = result.reverse().toString();
        int idx = 0;
        while (idx < str.length() && str.charAt(idx) == '0') {
            idx++;
        }
        return idx == str.length() ? "0" : str.substring(idx);
    }
}