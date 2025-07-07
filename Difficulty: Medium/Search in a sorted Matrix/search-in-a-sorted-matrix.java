

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==x){
                    return true;
                }
            }
        }
        return false;
        
    }
}
