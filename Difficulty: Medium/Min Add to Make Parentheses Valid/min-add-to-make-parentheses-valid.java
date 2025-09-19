 class Solution {
    public int minParentheses(String s) {
        int n=s.length();
        Stack <Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                st.push(c);
            }
            else
            {
                if(!st.isEmpty() && st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    st.push(c);
                }
            }
        }
        return st.size();

}
}