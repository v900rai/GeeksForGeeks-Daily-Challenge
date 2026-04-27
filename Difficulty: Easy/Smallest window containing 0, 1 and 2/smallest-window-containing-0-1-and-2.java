class Solution {
    public int smallestSubstring(String s) {
        int n = s.length();
        
        int[] freq = new int[3]; // for '0','1','2'
        int left = 0;
        int count = 0; // kitne unique (0,1,2) mile
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            
            int r = s.charAt(right) - '0';
            freq[r]++;
            
            // agar first time mila
            if (freq[r] == 1) {
                count++;
            }

            // jab 0,1,2 teeno mil gaye
            while (count == 3) {
                
                // minimum window update
                minLen = Math.min(minLen, right - left + 1);

                int l = s.charAt(left) - '0';
                freq[l]--;

                // agar koi character zero ho gaya
                if (freq[l] == 0) {
                    count--;
                }

                left++; // shrink window
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}