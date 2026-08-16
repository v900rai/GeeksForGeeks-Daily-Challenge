class Solution {
     public static int nextPrime(int n) {
      while(true){
          n++;
          int count =0;
          for(int i=1;i<=n;i++){
              if(n%i==0){
                  count++;
              }
          }
          if(count==2){
              break;
          }
      }
      return n;
     }
 }