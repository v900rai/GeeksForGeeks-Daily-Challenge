class Solution {
    static int closestNumber(int n, int m) {
        // code here
        if(n%m==0) return n;
        int m1 = Math.abs(m);
        int r=n%m1;
        int n1 = n-r;
        int n2 = n1 + (n>0?m1:-m1);
        int d1 = Math.abs(n-n1);
        int d2 = Math.abs(n-n2);
        if(d1<d2) return n1;
        else if(d2<d1) return n2;
        else return Math.abs(n1)>Math.abs(n2)?n1:n2;
    }
}