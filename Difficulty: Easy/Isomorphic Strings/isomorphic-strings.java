

class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
          
        if(s1.length()!=s2.length())
        {
            return false;
        }
        
        int ts[]=new int[256];
        int st[]=new int[256];
        
        Arrays.fill(ts,-1);
        Arrays.fill(st,-1);
        
        for(int i=0;i<s1.length();i++)
        {
            char ss=s1.charAt(i);
            char tt=s2.charAt(i);

            if(ts[ss]==-1 && st[tt]==-1)
            {
                ts[ss]=tt;
                st[tt]=ss;
            }
            
            else if(ts[ss]!=tt || st[tt]!=ss)
            {
                return false;
            }
        }
        
return true;
    
    }
}