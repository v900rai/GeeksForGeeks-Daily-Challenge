class Solution {
    public int dayBefore(int d, int n) {
        // code here
        int index = d;
        for ( int i = 0 ; i < n ; i++){
            index--;
            if ( index < 0 ){
                index = 6;
            }
        }
        return index;
    }
}