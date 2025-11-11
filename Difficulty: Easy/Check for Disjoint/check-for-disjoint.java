class Solution {
    public boolean areDisjoint(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int la = a.length;
        int lb = b.length;
        
        int l=0;
        int r=0;
        
        while(l < la && r < lb){
            if(a[l] == b[r]){
                return false;
            }else if(a[l] > b[r]){
                r++;
            }else{
                l++;
            }
        }
        
        return true;
    }
}