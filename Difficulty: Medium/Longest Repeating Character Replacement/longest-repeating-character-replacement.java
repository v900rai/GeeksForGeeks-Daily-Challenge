class Solution {
   
    public int longestSubstr(String S, int K) {
        Map<Character,Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;
        int max_freq = 0;
        while(end < S.length()){
            char ch = S.charAt(end);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
            max_freq = Math.max(max_freq,map.get(ch));
            int len = end-start+1;
            if(len - max_freq <= K){
                max = Math.max(max , len);
            }
            else{
                map.put(S.charAt(start),map.get(S.charAt(start))-1);
                start++;
                int maxInMap = 0;
                for(Map.Entry<Character,Integer> mpp : map.entrySet()){
                    maxInMap = Math.max(maxInMap,mpp.getValue());
                }
                max_freq = maxInMap;
            }
            end++;
        }
        return max;
    }
}