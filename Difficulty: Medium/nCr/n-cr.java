
class Solution {
    public int nCr(int n, int r) {
       // code here
        double ans=1;
        int diff=n-r;
        if(n==r || r==0) return 1;
        while(n>1){
              ans=(double)(ans*n)/((r)*(diff));
              if(r>1) r--;
              if(diff>1) diff--;
              n--;
        }
        return (int)Math.round(ans);
        
    }
}

 