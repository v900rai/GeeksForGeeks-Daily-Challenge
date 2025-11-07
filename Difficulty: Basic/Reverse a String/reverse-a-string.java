

class Solution{
    static String revStr(String s){
        StringBuilder revStr= new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            revStr.append(s.charAt(i));
        }
        return revStr.toString();
    }
}