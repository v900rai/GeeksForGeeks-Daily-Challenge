// User function Template for Java
class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
        int c0=0;
        int c1=0;
        int  c2=0;
        
    String key="0#0";
    long ans=0l;
        
        HashMap<String, Integer>hm= new HashMap<>();
        hm.put(key,1);
        
        for(char ch:str.toCharArray()){
            if(ch=='0')c0++;
            else if(ch=='1')c1++;
            else c2++;
            
            key=(c1-c0)+"#"+(c2-c1);
            if(hm.containsKey(key)){
                ans+=hm.get(key);
            hm.put(key,hm.get(key)+1);}
        
        else hm.put(key,1);
        }
        return ans;
        
    }
} 