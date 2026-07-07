public class Solution {

    public int largestArea(int n, int m, int k, int[][] mat) {

        // If there are no blocked cells, the entire grid is unblocked

        if (k == 0) {

            return n * m;

        }

 

        int[] rows = new int[k];

        int[] cols = new int[k];

 

        for (int i = 0; i < k; i++) {

            rows[i] = mat[i][0];

            cols[i] = mat[i][1];

        }

 

        // Sort the rows and columns to find consecutive gaps

        Arrays.sort(rows);

        Arrays.sort(cols);

 

        // Find maximum row gap

        int maxRowGap = rows[0] - 1; // Gap before the first blocked row

        for (int i = 1; i < k; i++) {

            maxRowGap = Math.max(maxRowGap, rows[i] - rows[i - 1] - 1);

        }

        maxRowGap = Math.max(maxRowGap, n - rows[k - 1]); // Gap after the last blocked row

 

        // Find maximum column gap

        int maxColGap = cols[0] - 1; // Gap before the first blocked column

        for (int i = 1; i < k; i++) {

            maxColGap = Math.max(maxColGap, cols[i] - cols[i - 1] - 1);

        }

        maxColGap = Math.max(maxColGap, m - cols[k - 1]); // Gap after the last blocked column

 

        // The maximum submatrix area is the product of the two maximum gaps

        return maxRowGap * maxColGap;

    }

 

    

        

    }

 