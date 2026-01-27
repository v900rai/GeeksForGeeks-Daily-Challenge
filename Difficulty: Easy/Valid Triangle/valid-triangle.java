class Solution {
    public boolean checkValidity(int a, int b, int c) {
        // code here
        int a1 =b+c; // b+c > a
        int b1 =a+c; // a+c > b
        int c1 =a+b; // a+b > c
        
        if(a1>a && b1>b && c1>c){
            return true;
        }
        return false;
    }
}