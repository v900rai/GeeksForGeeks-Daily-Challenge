

//User function Template for Java



class Solution
{
    char firstRep(String S)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : S.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char c:S.toCharArray()){
            if(map.get(c)>1)
            return c;
        }
         return '#';
    }
          
}