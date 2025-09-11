// User function Template for Java

class Solution {
  public long[] factorial(long a[], int n) {
        long max=0;
        for(long i:a)
        {
            max= Math.max(max,i);
        }
         long dp[] = new long[(int)max+1];
         dp[0]= 1;
         HashMap<Long,Long> map = new HashMap<>();
         map.put((long)0,(long)1);
         for(int i=1; i<= max; i++)
         {
             dp[i] = (dp[i-1]*i)%1000000007;
             map.put((long)i, dp[i]);
         }
         long ans[]= new long[n];
          for(int i=0; i< n ; i++)
         {
            if(map.containsKey(a[i]))
            {
                ans[i] = map.get(a[i]);
            }
         }
         return ans;
    }

 
}