

class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            if (Character.isUpperCase(c)){
                 str.append(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)){
                str.append(Character.toUpperCase(c));
            }
            else str.append(c);
        }
        return str.toString();
    }
}