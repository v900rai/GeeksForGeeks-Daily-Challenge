class Solution {
    public int celebrity(int[][] mat) {
        int n = mat.length;

        // Step 1: Assume the first person (index 0) is the potential celebrity
        int candidate = 0;

        // Check against every other person from index 1 to n-1
        for (int i = 1; i < n; i++) {
            // If candidate knows person i, then candidate can't be a celebrity
            if (mat[candidate][i] == 1) {
                candidate = i; // So we make person i the new candidate, and check for other potential candidates
            }
        }

        // Step 2: Verify that the candidate is a real celebrity
        for (int i = 0; i < n; i++) {
            if (i == candidate) continue; // Skip checking candidate against themselves

            // A real celebrity should not know anyone else (mat[candidate][i] == 0)
            // And everyone else should know the celebrity (mat[i][candidate] == 1)
            if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                return -1; // If any condition fails, no celebrity exists
            }
        }

        // If all checks pass, return the celebrity's index
        return candidate;
    }
}