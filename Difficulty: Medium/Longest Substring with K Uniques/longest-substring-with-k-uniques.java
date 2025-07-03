class Solution {
    public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0, n=s.length();
        int i=0,j=0;
        
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            
            while(map.size()>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            
            if(map.size()==k){
                ans=Math.max(ans,j-i+1);
            }
            j++;
        }
        
        return ans==0?-1:ans;
    }
}