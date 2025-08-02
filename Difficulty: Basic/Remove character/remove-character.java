// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        String s = "";
        for(int i=0;i<str1.length();i++){
            if(str2.indexOf(str1.charAt(i))==-1){
                s=s+str1.charAt(i);
            }
        }
        return s;
    }
}