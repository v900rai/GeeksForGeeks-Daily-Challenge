// User function Template for Java


class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        String prev =s,curr = "";
        
        for(int i=1; i<=r; i++){
            for(int j=0; j<prev.length(); j++){
                if(prev.charAt(j)=='1') curr +="10";
                else curr+="01";
                
                if(curr.length()>n) break;
            }
           
            prev = curr;
            curr="";
        }
        
        return prev.charAt(n);
    }
}

