import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int m = mat.length;        // rows
        int n = mat[0].length;     // columns
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        // Traverse column-wise
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(mat[j][i]);  // swapping indices
            }
            result.add(row);
        }
        
        return result;
    }
}
