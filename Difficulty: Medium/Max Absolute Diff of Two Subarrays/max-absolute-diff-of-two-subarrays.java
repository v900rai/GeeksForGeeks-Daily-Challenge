class Solution {

    public int maxDiffSubArrays(int[] arr) {

        int n = arr.length;

 

        int[] leftMax = new int[n];

        int[] leftMin = new int[n];

        int[] rightMax = new int[n];

        int[] rightMin = new int[n];

 

        int curr = arr[0], best = arr[0];

        leftMax[0] = best;

        for (int i = 1; i < n; i++) {

            curr = Math.max(arr[i], curr + arr[i]);

            best = Math.max(best, curr);

            leftMax[i] = best;

        }

 

        curr = arr[0];

        best = arr[0];

        leftMin[0] = best;

        for (int i = 1; i < n; i++) {

            curr = Math.min(arr[i], curr + arr[i]);

            best = Math.min(best, curr);

            leftMin[i] = best;

        }

 

        curr = arr[n - 1];

        best = arr[n - 1];

        rightMax[n - 1] = best;

        for (int i = n - 2; i >= 0; i--) {

            curr = Math.max(arr[i], curr + arr[i]);

            best = Math.max(best, curr);

            rightMax[i] = best;

        }

 

        curr = arr[n - 1];

        best = arr[n - 1];

        rightMin[n - 1] = best;

        for (int i = n - 2; i >= 0; i--) {

            curr = Math.min(arr[i], curr + arr[i]);

            best = Math.min(best, curr);

            rightMin[i] = best;

        }

 

        int ans = 0;

        for (int i = 0; i < n - 1; i++) {

            ans = Math.max(ans, Math.abs(leftMax[i] - rightMin[i + 1]));

            ans = Math.max(ans, Math.abs(leftMin[i] - rightMax[i + 1]));

        }

 

        return ans;

    }

}