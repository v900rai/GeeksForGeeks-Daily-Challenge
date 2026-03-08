class Solution {
    static int sumOfDigits(int n) {
       /* // code here
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            n=n/10;
            
        }
        return sum;*/
        
        if(n==0) 
        return 0;
        return (n%10) + sumOfDigits(n/10);
        
    }
}
