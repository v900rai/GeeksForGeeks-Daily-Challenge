class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            n=n/10;
            
        }
        return sum;
        
    }
}
