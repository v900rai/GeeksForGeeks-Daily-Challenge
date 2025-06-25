class Solution {
    boolean sameFreq(String s) {
        int[] map = new int[26];
        int max = 0;
        int maxCount = 0;
        boolean del = false;
        
        for(char ch : s.toCharArray()) {
            map[ch - 'a']++;
            max = Math.max(max,map[ch - 'a']);
        }
        
        for(int i = 0; i < 26; ++i) {
            if(map[i] == max) {
                maxCount++;
                map[i] = 0;
            }
        }
        
        for(int ele : map) {
            if(ele == 0 || ele == max) continue;
            
            if(maxCount > 1 && !del && ele == 1) del = true;
            else if(maxCount == 1 && max - ele == 1 && !del) {
                del = true;
                max -= 1;
            }
            
            else return false;
        }
        
        return true;
    }
}
 