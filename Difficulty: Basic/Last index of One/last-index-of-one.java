

//User function Template for Java


class Solution {
    public int lastIndex( String s) {
        int index=-1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                index=i;
            }
        }
        return index;
        
        
    }
}