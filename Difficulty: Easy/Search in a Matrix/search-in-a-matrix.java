// User function Template for Java

class Solution {
    // Function to search a given integer in a matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int num[] : mat){
            for(int a:num){
                if(a== x){
                    return true;
                }
            }
        }
        return false;
    }
}
