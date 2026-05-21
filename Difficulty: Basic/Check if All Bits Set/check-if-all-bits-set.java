class Solution {
    public boolean isBitSet(int n) {
        // code here
        if(n==0){
            return false;
        }
        Boolean val=check(n);
        return val;
    }
    public Boolean check(int n){
        while(n!=0)
        {
            int m=n%2;
            if(m==0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
};