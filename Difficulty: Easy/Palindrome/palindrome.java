



//User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
       int reverse=0;
       int temp=n;
       while(temp!=0){
           reverse=(reverse*10)+(temp%10);
           temp/=10;
       }
       if(reverse==n){
           return true;
       }else{
           return false;
       }
    }
}