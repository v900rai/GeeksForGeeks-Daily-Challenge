class Solution {
    public static int findPattern(String s, String p) {
        // code here
        if(s.contains(p)){
        String subst = new String(p);
        int a = s.indexOf(subst);
        return a;
    }
    return -1;
    }
}
