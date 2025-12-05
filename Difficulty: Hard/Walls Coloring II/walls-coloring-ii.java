class Solution {
    public int minCost(int[][] costs) {
        int n = costs.length;
        if (n == 0) return 0;

        int k = costs[0].length;
        if (k == 1 && n > 1) return -1;

        int prevMin = 0, prevSecondMin = 0, prevMinIndex = -1;

        for (int i = 0; i < n; i++) {
            int currMin = Integer.MAX_VALUE;
            int currSecondMin = Integer.MAX_VALUE;
            int currMinIndex = -1;

            for (int j = 0; j < k; j++) {
                int cost = costs[i][j] + (j == prevMinIndex ? prevSecondMin : prevMin);

                if (cost < currMin) {
                    currSecondMin = currMin;
                    currMin = cost;
                    currMinIndex = j;
                } else if (cost < currSecondMin) {
                    currSecondMin = cost;
                }
            }

            prevMin = currMin;
            prevSecondMin = currSecondMin;
            prevMinIndex = currMinIndex;
        }

        return prevMin;
    }
}

