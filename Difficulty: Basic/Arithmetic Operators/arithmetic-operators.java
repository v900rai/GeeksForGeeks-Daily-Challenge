import java.util.*;
class Solution {
    public int[] computeOperations(int x, int y) {
        // code here
   int p = x + y; // Addition
   int q = x - y; // Subtraction
   int r = x * y; // Multiplication
   int s = x / y; // Division
   int t = x % y; // Modulo
       
       return new int[]{p,q,r,s,t};
        
    }
    public static void main(String [] args){
        Solution obj = new Solution();
        int[] result = obj.computeOperations(1,2);
        System.out.println(Arrays.toString(result));
    }
}

