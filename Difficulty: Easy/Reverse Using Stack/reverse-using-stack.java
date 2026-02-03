



class Solution {
    
    public String reverse(String S) {
        // Stack to store characters of the string
        Stack<Character> s = new Stack<>();
        
        // StringBuilder to build the reversed string
        StringBuilder ans = new StringBuilder();
        
        // Push each character of the string onto the stack
        for (char c : S.toCharArray()) {
            s.push(c);
        }
        
        // Pop each character from the stack and append it to the result
        while (!s.isEmpty()) {
            ans.append(s.pop());
        }
        
        // Return the reversed string
        return ans.toString();
    }
}
