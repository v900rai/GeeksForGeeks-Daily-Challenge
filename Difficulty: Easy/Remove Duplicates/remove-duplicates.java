// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        String res ="";
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                res+=ch;
                map.put(ch,1);
            }
        }
        return res;
    }
}