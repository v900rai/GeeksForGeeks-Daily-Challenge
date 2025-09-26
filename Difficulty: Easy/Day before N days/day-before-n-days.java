class Solution {
    public static int nthDay(int d, int n) {
        // write your code here
        int effectiveN = n%7;
        int result = (d-effectiveN+7) % 7;
        return result;
    }
}

