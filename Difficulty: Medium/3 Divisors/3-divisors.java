// User function Template for Java
class Solution {
    
    static int sieve(int n) {
        ArrayList<Integer> sie = new ArrayList<>();
        
        if (n>1) {
            sie.add(2);
           
            for (int i=3; i<=n; i++) {
                boolean additionalDivisor = false;
                for (int j=2; j<=Math.sqrt(i); j++) {
                    if (i%j==0) {
                        additionalDivisor = true;
                        break;
                    }
                }
                if (!additionalDivisor) {
                    sie.add(i);
                }
            }
        }
        
        return sie.size();
    }
    
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        ArrayList<Integer> result = new ArrayList<>();
       
       for (Long qValue: query) {
           result.add(sieve((int)Math.sqrt(qValue)));
       }
       
       return result;
    }

}