class Solution {

     private static final long MOD = 1000000007L;



     // Helper method to compute power modulo MOD

     private static long power(long base, long exp) {

         long res = 1;

         base = base % MOD;

         while (exp > 0) {

             if ((exp & 1) == 1) {

                 res = (res * base) % MOD;

             }

             base = (base * base) % MOD;

             exp >>= 1;

         }

         return res;

     }



     // Helper method to compute modular inverse

     private static long modInverse(long n) {

         return power(n, MOD - 2);

     }



     public int prefixStrings(int n) {

         if (n == 0 || n == 1) {

             return 1;

         }



         long catalan = 1;



         // Compute C_i from C_{i-1}

         for (int i = 1; i <= n; i++) {

             long numerator = (4 * i - 2) % MOD;

             long denominatorInverse = modInverse(i + 1);



             // C_i = (C_{i-1} * (4i - 2) * inv(i + 1)) % MOD

             catalan = (catalan * numerator) % MOD;

             catalan = (catalan * denominatorInverse) % MOD;

         }



         return(int) catalan;

     }

 }