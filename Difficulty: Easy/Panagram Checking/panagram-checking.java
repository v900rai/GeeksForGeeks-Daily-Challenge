

   class Solution {
    public static boolean checkPangram(String s) {
              // convert all character to lower case
         s = s.toLowerCase();
        for(char c ='a'; c<='z';c++)
        {
            if(!s.contains(String.valueOf(c)))
            {
                return false;
            }            
        }
        return true; 
    }
}