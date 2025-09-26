class Solution {
    static boolean prime(int n){
        for(int i=2; i<n; i++){


            if(n%i==0){


                return false;
            }
        }
        return true;
    }
    
    public static int nextPrime(int n) {
        int i = n;
        for(i=n+1;i<=500;i++){
            boolean isPrime = false;
            isPrime = prime(i);
            if(isPrime){
                return i;
            }
            
        }
        return i;
    }
}

