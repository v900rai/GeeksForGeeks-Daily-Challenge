

// User function template for Java

class Solution {
    static String delAlternate(String s) {
        String str="";
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                str=str+s.charAt(i);
            }
        }
        return str;
    }
}