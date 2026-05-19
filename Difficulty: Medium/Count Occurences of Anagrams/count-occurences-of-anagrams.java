// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        int i = 0, j = 0;
        Map<Character, Integer> patMap = new HashMap<>();
        int k = pat.length();
        for(char ch : pat.toCharArray()){
            patMap.merge(ch, 1, Integer::sum);
        }
        int count = patMap.size();
        int resCount = 0;
        while(j < txt.length()){
            char end = txt.charAt(j);
            if(patMap.containsKey(end)){
                patMap.merge(end, -1, Integer::sum);
                if(patMap.get(end) == 0){
                    count--;
                }
            }    
            if(j - i + 1 == k){
                if(count == 0){
                    resCount++;
                }
                char start = txt.charAt(i);
                if (patMap.containsKey(start)) {
                    if(patMap.get(start) == 0){
                        count++;
                    }
                    patMap.put(start, patMap.get(start) + 1);
                }
                i++;
            }
            j++;
        }
        return resCount;
    }
}