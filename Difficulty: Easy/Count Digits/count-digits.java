

// User function Template for Java
class Solution {
    static int evenlyDivides(int n) {
        // code here
        int m=n;
        int count=0;
        while(m>0){
            int digit=m%10;
            if(digit>0){
                if(n%digit==0){
                    count+=1;
                }
            }
            m/=10;
        }
        
        return count;
        
    }
}