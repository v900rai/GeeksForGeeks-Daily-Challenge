// User function Template for Java
class Solution {
    public boolean checkValidity(int a, int b, int c) {
        // code here
        if ((a+b)<=c) return false;
         if ((c+b)<=a) return false;
         if ((a+c)<=b) return false;
         
         return true;
    }
}