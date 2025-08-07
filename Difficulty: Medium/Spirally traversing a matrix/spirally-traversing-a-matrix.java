



class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
         ArrayList<Integer> ans = new ArrayList<>();
        
        int n = mat.length; // no. of rows
        int m = mat[0].length; // no. of columns 
        
        // Initialize the pointers required for traversal.
        int top  = 0;
        int left = 0;
        int bottom = n - 1;
        int right = m - 1;

        // Loop until all elements are not traversed full reversed 
        while (top <= bottom && left <= right) {

            // For moving left to right
            for (int i = left; i <= right; i++)
                ans.add(mat[top][i]);

            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                ans.add(mat[i][right]);

            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);

                left++;
            }
        }
        return ans;
    }
}
