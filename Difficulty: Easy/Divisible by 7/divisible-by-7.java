// User function Template for Java

class Solution 
{
    int isdivisible7(String num) 
    {
        int n = 0;
        
        for (int i = 0; i < num.length(); i++) 
        {
            n = (n * 10 + (num.charAt(i) - '0')) % 7;
        }
        
        return (n == 0) ? 1 : 0;
    }
}