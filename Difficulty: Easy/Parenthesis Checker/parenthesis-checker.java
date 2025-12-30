import java.util.Stack;

class Solution {

    // Method to check if the given string has balanced parentheses, braces, and brackets
    static boolean isBalanced(String s) {

        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the given string
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i); // current character

            // If character is an opening bracket, push into stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // store the bracket
            }

            // If character is a closing bracket
            else {

                // If stack is empty → no matching opening bracket exists
                if (stack.isEmpty()) {
                    return false;  // unbalanced
                }

                // Check mismatch cases:

                // Closing '}' should match '{'
                if (c == '}' && stack.peek() != '{') {
                    return false;
                }

                // Closing ']' should match '['
                if (c == ']' && stack.peek() != '[') {
                    return false;
                }

                // Closing ')' should match '('
                if (c == ')' && stack.peek() != '(') {
                    return false;
                }

                // If matching pair found → remove opening bracket
                stack.pop();
            }
        }

        // If stack still contains elements → some opening brackets not closed
        if (!stack.isEmpty()) {
            return false;
        }

        return true; // Fully balanced string
    }
/*
    // Main method for testing
    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})"));  // true
        System.out.println(isBalanced("([)]"));    // false
        System.out.println(isBalanced("{[()]}"));  // true
        System.out.println(isBalanced("{[(])}"));  // false
    }*/
}
