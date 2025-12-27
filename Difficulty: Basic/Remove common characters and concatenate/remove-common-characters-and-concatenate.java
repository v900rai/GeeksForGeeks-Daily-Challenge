class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here
        // String res="";
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character>set2=new HashSet<>();
        
        
      for(char c: s1.toCharArray()){
          set1.add(c);
      }
    
   for(char c: s2.toCharArray()){
       set2.add(c);
   }
   StringBuilder res=new StringBuilder();
   
   
   for(char c: s1.toCharArray()){
       if(!set2.contains(c))
       res.append(c);
   }
   
   for(char c: s2.toCharArray()){
       if(!set1.contains(c))
       res.append(c);
   }
   if(res.length()==0){
       return "-1";
   }
   return res.toString();
    }
}
 