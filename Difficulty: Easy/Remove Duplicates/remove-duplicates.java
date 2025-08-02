



// User function Template for Java

class Solution {
    String removeDups(String str) {
        /* String res="";
        for(int i=0;i<str.length();i++){
            String ch=""+str.charAt(i);
            if(res.contains(ch)){
                continue;
            }
            res+=ch;
        }
        return res;*/
        
    /*    String ans="";
        for(int i=0; i<str.length(); i++){
            String ch=""+str.charAt(i);
            if(ans.contains(ch)){
                continue;
            }
            ans=ans+ch;
        }
        return ans;
    }
}*/

String hh="";
for(int i=0; i<str.length(); i++){
    String chr=""+str.charAt(i);
    if(hh.contains(chr)){
        continue;
    }
    hh=hh+chr;
}
return hh;
}
}
