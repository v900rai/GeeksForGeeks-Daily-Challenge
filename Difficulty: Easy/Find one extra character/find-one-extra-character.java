// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
         char [] s3 = s1.toCharArray();
        char [] s4 = s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        for(int i =0;i<s2.length()-1;i++){
            if(s3[i] != s4[i]){
                return s4[i];
            }
        }
        return s4[s4.length-1];
    }
}
