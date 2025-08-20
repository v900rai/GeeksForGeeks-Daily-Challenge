// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int count=0;
        String res=Integer.toBinaryString(n);
        for(char c : res.toCharArray()){
            if(c=='1'){
                count++;
            }
            
        }
        return count;
    }
}