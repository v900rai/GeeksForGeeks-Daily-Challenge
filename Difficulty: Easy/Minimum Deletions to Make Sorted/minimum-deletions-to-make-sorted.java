class Solution {
    public int minDeletions(int[] arr) {
        
        if (arr == null || arr.length == 0) {
            return 0;
        }

        java.util.List<Integer> tails = new java.util.ArrayList<>();

        for (int num : arr) {
            if (tails.isEmpty() || num > tails.get(tails.size() - 1)) {
                tails.add(num);
            } else {
                int left = 0;
                int right = tails.size() - 1;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (tails.get(mid) < num) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                tails.set(left, num);
            }
        }

        int lisLength = tails.size();
        return arr.length - lisLength;
    }
}