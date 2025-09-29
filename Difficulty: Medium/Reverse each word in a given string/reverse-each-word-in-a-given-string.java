class Solution {
    public String reverseWords(String s) {

        String[] str=s.trim().split("\\s+"); 
        StringBuilder sb=new StringBuilder(); 
        for(int i=0;i<str.length;i++) {
            sb.append(new StringBuilder(str[i]).reverse()); 
            if(i!=0||i==0){ 
                sb.append(" "); 
            }
        }

        return sb.toString().trim(); 
    }
}

