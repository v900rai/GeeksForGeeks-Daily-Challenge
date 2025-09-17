class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
               
                k = k * 10 + (c - '0');
            } else if (c == '[') {
               
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                
                int repeat = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int i = 0; i < repeat; i++) {
                    decoded.append(current);
                }
                current = decoded;
            } else {
               
                current.append(c);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[b2[ca]]")); 
        System.out.println(decodeString("3[ab]"));
    }
}