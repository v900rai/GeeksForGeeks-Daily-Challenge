// User function Template for Java

class Solution {
public int smallestSubstring(String S) {
       HashMap<Character, Integer>map = new HashMap<>();
       int j=0, min = Integer.MAX_VALUE;
       for(int i=0; i<S.length(); i++){
           char c = S.charAt(i);
           map.put(c, map.getOrDefault(c, 0)+1);
           while(map.size()==3){
               min = Math.min(i-j+1, min);
               c = S.charAt(j); 
               if(map.get(c)==1){
                    map.remove(c);
               }else
                    map.put(c, map.getOrDefault(c, 0)-1);
                    
                j++;
           }
       }
       if(min==Integer.MAX_VALUE)
            return -1;
       return min;
    }
}