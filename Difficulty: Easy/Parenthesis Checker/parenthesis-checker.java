


import java.util.Stack;

class Solution {
    // Method to check if the given string has balanced parentheses, braces, and brackets
    static boolean isBalanced(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            // If it's an opening bracket, push to stack
            if(c=='(' || c=='{' || c=='[') {
                stack.push(c);
            }
            else {
                // If stack is empty when encountering a closing bracket, it's unbalanced
                if(stack.size() == 0)
                    return false;
                
                // Check if the closing bracket matches the most recent opening bracket
                else if(c == '}' && stack.peek() != '{')  
                    return false;
                
                else if(c == ']' && stack.peek() != '[') 
                    return false;
                
                else if(c == ')' && stack.peek() != '(') 
                    return false;
                
                // If it matches, pop the opening bracket from stack
                else 
                    stack.pop();
                    // remove the all elements 
                    
            }
        }
        
        // If stack is not empty at the end, some brackets weren't closed
        if(stack.size() > 0) 
            return false;
            
        return true;
    }
}