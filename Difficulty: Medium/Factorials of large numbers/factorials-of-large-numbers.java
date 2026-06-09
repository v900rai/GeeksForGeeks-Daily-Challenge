import java.util.*;
import java.math.BigInteger;

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> res = new ArrayList<>();

        // Step 1: Calculate factorial using BigInteger
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        // Step 2: Extract digits
        while (fact.compareTo(BigInteger.ZERO) > 0) {
            int rem = fact.mod(BigInteger.TEN).intValue();
            res.add(rem);
            fact = fact.divide(BigInteger.TEN);
        }

        // Step 3: Reverse to correct order
        Collections.reverse(res);

        return res;
    }
}