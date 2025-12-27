class Solution {
    public static String stringMirror(String s) {
        
        int i=1;
        for(;i<s.length();i++){
            
            if(s.charAt(i)>s.charAt(i-1)) 
                break;
            if(i==1 && s.charAt(i)==s.charAt(i-1)) 
                break;  // agar staring me char equal ho i.e bbbaa: ans is bb
        }
        
        String tmp = s.substring(0,i);
        StringBuilder sb = new StringBuilder(tmp);
        sb.reverse();
        
        return tmp+sb.toString();
    }
}