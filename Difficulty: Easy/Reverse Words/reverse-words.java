class Solution {
    public String reverseWords(String s) {
        // Code here
        int n = s.length();
       StringBuilder st = new StringBuilder();
       List<String>ans=new ArrayList<>();
        for(int i =0 ; i<n;i++)
        {
            if(s.charAt(i)!='.')
            {
                st.append(s.charAt(i));
            }
            else if(st.length()>0){
                ans.add(st.toString());
                st.setLength(0);// Vanishing everything present in it;
            }
        }
        if(st.length()>0)
        {
            ans.add(st.toString());
        }
        Collections.reverse(ans);
        st.setLength(0);
        for(String i : ans)
        {
            st.append(i);
            st.append('.');
        }
        st.deleteCharAt(st.length()-1);
        return st.toString();
    }
}