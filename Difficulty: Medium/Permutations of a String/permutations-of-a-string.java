class Solution
{
    public ArrayList<String> findPermutation(String s)
    {
        // Code here
        Set<String> ans=new HashSet<>();
        genPer(s, "",ans);
        return new ArrayList(ans);
    }
    public void genPer(String s, String a, Set<String> result)
    {
        if(s.isEmpty())
        {
            result.add(a);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String nq=s.substring(0,i)+s.substring(i+1);
            genPer(nq,a+ch,result);
        }
    }
}

