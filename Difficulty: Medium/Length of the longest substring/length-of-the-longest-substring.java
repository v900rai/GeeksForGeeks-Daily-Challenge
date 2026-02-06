class Solution {
    int longestUniqueSubstring(String s) {
       
       int i=0,j=0;
       int mx=-1;
        HashMap<Character,Integer> map = new HashMap<>();
       
       while(j<s.length())
       {
           char str= s.charAt(j);
           map.put(str,map.getOrDefault(str,0)+1);
           
           if(map.size()==(j-i+1))
           {
               mx=Math.max(mx,j-i+1);
               j++;
           }
           
           else if(map.size()<(j-i+1))
           {
               while(map.size()<(j-i+1))
               {
                   char str1= s.charAt(i);
                   map.put(str1,map.get(str1)-1);
                   if(map.get(str1)==0)
                   {
                       map.remove(str1);
                   }
                   i++;
               }
               j++;
           }
           
       }
       return mx;
        
    }
}