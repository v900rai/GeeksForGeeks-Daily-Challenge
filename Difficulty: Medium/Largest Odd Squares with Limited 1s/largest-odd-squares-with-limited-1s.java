class Solution {

    ArrayList<Integer> largestSquare(int[][] mat, int[][] queries, int k){

        int n = mat.length;

        int m = mat[0].length;

        ArrayList<Integer> result = new ArrayList<>();

 

        // 1. Build a 2D prefix sum array (1-indexed for convenience)

        int[][] pref = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                pref[i][j] = mat[i - 1][j - 1] 

                           + pref[i - 1][j] 

                           + pref[i][j - 1] 

                           - pref[i - 1][j - 1];

            }

        }

 

        // 2. Process each query using Binary Search

        for (int[] q : queries) {

            int i = q[0];

            int j = q[1];

 

            // Maximum radius the square can grow without expanding out of bounds

            int maxRadius = Math.min(Math.min(i, j), Math.min(n - 1 - i, m - 1 - j));

            

            int low = 0;

            int high = maxRadius;

            int maxValidRadius = -1;

 

            // Binary search to find the largest valid radius

            while (low <= high) {

                int midRad = low + (high - low) / 2;

 

                // Determine boundaries of the square (0-indexed)

                int r1 = i - midRad;

                int c1 = j - midRad;

                int r2 = i + midRad;

                int c2 = j + midRad;

 

                // Calculate the sum of 1s in the square using the 2D prefix sum array

                int onesCount = pref[r2 + 1][c2 + 1] 

                             - pref[r1][c2 + 1] 

                             - pref[r2 + 1][c1] 

                             + pref[r1][c1];

 

                if (onesCount <= k) {

                    maxValidRadius = midRad; // midRad is valid, try to find a larger one

                    low = midRad + 1;

                } else {

                    high = midRad - 1; // Too many 1s, decrease the square size

                }

            }

 

            // Convert radius to total odd side length (2 * radius + 1)

            if (maxValidRadius != -1) {

                result.add(2 * maxValidRadius + 1);

            } else {

                result.add(-1);

            }

        }

 

        return result;

    }

}

 