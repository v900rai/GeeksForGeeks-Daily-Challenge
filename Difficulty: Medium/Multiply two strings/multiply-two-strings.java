//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends




//User function Template for Java



class Solution
{
    public String multiplyStrings(String s1, String s2)
    {
        // Create BigInteger objects for the input strings
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        
        // Multiply the two BigInteger numbers
        BigInteger result = num1.multiply(num2);
        
        // Return the result as a string
        return result.toString();
    }
/*
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "-123456789";
        String s2 = "987654321";
        System.out.println(solution.multiplyStrings(s1, s2)); // Output: "-121932631112635269"
    }*/
}
