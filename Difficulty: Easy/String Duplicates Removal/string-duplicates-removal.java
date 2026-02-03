class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set= new HashSet<> ();
        String out="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(set.add(c))
            {
                out+=c;
            }
        }
        return out;
    }
}

