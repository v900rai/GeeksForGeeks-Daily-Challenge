import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
    
         if (n < 2) {
            System.out.println("False");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "True" : "False");
    }
}