



class Solution {
    static char nonRepeatingChar(String S) {
        // Character की frequency count करने के लिए HashMap
          Map<Character, Integer> freqMap = new HashMap<>();
          for(int i=0; i<S.length(); i++){
              char ch = S.charAt(i);
              freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
          }
          

        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(freqMap.get(ch) == 1){
                return ch;
            }
        }

        // अगर कोई भी non-repeating character नहीं मिला
        return '$';
    }
}

