// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        String result="";
        int i=0;
        int j=0;
        int n1=S1.length();
        int n2=S2.length();
        while(i<n1 && j<n2){
            result+=S1.charAt(i++);
            result+=S2.charAt(j++);
        }
        while(i<n1){
           result+=S1.charAt(i++); 
        }
        while(j<n2){
             result+=S2.charAt(j++);
        }
        return result;
    }
}

