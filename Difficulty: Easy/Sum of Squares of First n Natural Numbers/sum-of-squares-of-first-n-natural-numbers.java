// User function Template for Java
class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int n) {
        // code here
        int ans=0;
        for(int i=1; i<=n; i++){
            ans+=(i*i);
        }
        return ans;
    }
}