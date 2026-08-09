class Solution {
    static int closestNumber(int n, int m) {
        // code here
       int a =  (n-(n%m));
       int b = (n*m > 0) ? a+m : a-m;
    if(Math.abs(n-a) < Math.abs(n-b)){
        return a;
    }
       return b;
       
    }
}