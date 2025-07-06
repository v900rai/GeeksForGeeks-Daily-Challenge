// User function Template for Java


class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> res = new ArrayList<>();
        if(s==null||s.length()==0)
        return res;
        
        char ch[] = s.toCharArray();
        StringBuilder ds = new StringBuilder();
        allPossibleSubstrings(0,ch,ds,res);
        Collections.sort(res);
        return res;
    }
    private void allPossibleSubstrings(int idx,char[] ch,
    StringBuilder ds,List<String> res)
    {
        if(idx>=ch.length)
        {
            if(ds.length() != 0)
            res.add(ds.toString());
            return;
        }
        ds.append(ch[idx]);
        allPossibleSubstrings(idx+1,ch,ds,res);
        ds.deleteCharAt(ds.length()-1);
        allPossibleSubstrings(idx+1,ch,ds,res);
    }
}