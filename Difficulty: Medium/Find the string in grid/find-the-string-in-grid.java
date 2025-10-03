class Solution {
    // Directions: (row, col)
    private static final int[][] DIRECTIONS = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1},   // Up, Down, Left, Right
        {-1, -1}, {-1, 1}, {1, -1}, {1, 1}  // Diagonals: UL, UR, DL, DR
    };
    
    public int[][] searchWord(char[][] grid, String word) {
        int n = grid.length;
        int m = grid[0].length;
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    if (searchFromCell(grid, word, i, j)) {
                        result.add(new int[]{i, j});
                    }
                }
            }
        }

        // Convert result list to array
        int[][] resultArray = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    private boolean searchFromCell(char[][] grid, String word, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;
        int len = word.length();

        for (int[] dir : DIRECTIONS) {
            int newX = x, newY = y;
            int k;

            // Check in the current direction
            for (k = 0; k < len; k++) {
                if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == word.charAt(k)) {
                    newX += dir[0];
                    newY += dir[1];
                } else {
                    break;
                }
            }

            // If full word is found in this direction
            if (k == len) {
                return true;
            }
        }

        return false;
    }
}
 