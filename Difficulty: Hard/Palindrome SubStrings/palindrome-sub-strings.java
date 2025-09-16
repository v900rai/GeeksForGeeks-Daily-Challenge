class Solution {
    public int countPS(String s) {
        // code here
        int n = s.length();
        int count = 0;
        int left;
        int right = 0;
        for(int i=0;i<n;i++) {
            left = i-1; right = i;
            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
            left = i - 1;
            right = i + 1;
            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
