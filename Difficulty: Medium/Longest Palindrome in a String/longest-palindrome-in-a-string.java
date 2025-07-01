
class Solution {
    static String longestPalindrome(String s) {
        // code here
        int n=s.length();
        int len, maxLen=0;
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPallin(s,i,j)){
                    len=j-i+1;
                    maxLen=Math.max(maxLen,len);
                    if(maxLen==len && ans.length()!=len){
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
    
    static boolean isPallin(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))
            return false;
            start++;
            end--;
        }
        return true;
    }
}