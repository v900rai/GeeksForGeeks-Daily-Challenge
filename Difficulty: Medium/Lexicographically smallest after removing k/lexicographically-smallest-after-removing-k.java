class Solution {
    
    private boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public String lexicographicallySmallest(String s, int k) {

        int n = s.length();

        // Correct k
        if (isPowerOfTwo(n)) {
            k /= 2;
        } else {
            k *= 2;
        }

        // Not possible
        if (k >= n) {
            return "-1";
        }

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            while (k > 0 &&
                   stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > ch) {

                stack.deleteCharAt(stack.length() - 1);
                k--;
            }

            stack.append(ch);
        }

        // If removals are still left
        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        return stack.toString().length() == 0 ? "-1" : stack.toString();
    }
}