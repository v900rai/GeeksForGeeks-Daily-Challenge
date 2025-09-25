import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt();
        System.out.println(nextPrime(n));
    }
    public static boolean isPrime( int n ){
        if ( n <= 1 ) return false;
        if ( n <= 3 ) return true;
        
        for ( int i = 2 ; i*i <= n ; i++ ){
            if ( n % i == 0 ) 
            return false;
        }
        return true;
    }
    public static int nextPrime ( int n ) {
        if ( n <= 1 ) return 2;
        int number = n;
        boolean found = false;
        while ( !found ){
            number++;
            if ( isPrime( number ) ){
                found = true;
            }
        }
        return number;
    }
}
