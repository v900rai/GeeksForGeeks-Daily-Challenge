class Solution {
    String removeSpaces(String S) {
        StringBuilder st=new StringBuilder();
        for(int i=0; i<S.length(); i++){
            char ch=S.charAt(i);
            if(ch==' '){
                continue;
            }
            st.append(ch);
        }
        return st.toString();
        
    }
}