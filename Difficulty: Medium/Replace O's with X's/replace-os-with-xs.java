class Solution {
    public void fill(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 'O') q.offer(new int[]{i, 0});
            if (grid[i][m - 1] == 'O') q.offer(new int[]{i, m - 1});
        }
        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 'O') q.offer(new int[]{0, j});
            if (grid[n - 1][j] == 'O') q.offer(new int[]{n - 1, j});
        }
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int x = cell[0], y = cell[1];
            if (x < 0 || y < 0 || x >= n || y >= m || grid[x][y] != 'O') continue;
            grid[x][y] = '#';
            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && grid[nx][ny] == 'O')
                    q.offer(new int[]{nx, ny});
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'O') grid[i][j] = 'X';
                else if (grid[i][j] == '#') grid[i][j] = 'O';
            }
        }
    }
}