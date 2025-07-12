// User function Template for Java

class Solution {
    static int countSquares(int n) {
       
       // code here
        int count=0;
        for(int i=1;i<Math.sqrt(n);i++)
        {
            long sq=(long)Math.pow(i,2);
            count++;
        }
        return count;
    }
}