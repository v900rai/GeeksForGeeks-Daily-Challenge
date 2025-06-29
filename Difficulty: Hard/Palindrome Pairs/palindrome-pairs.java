// User function Template for Java

class Solution {
    static boolean palindromepair(int N, String arr[]) {
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                
            
            if(arr[i].charAt(0)==arr[j].charAt(arr[j].length()-1) || arr[j].charAt(0)==arr[i].charAt(arr[i].length()-1))   
                
                  if(helper(arr[i]+arr[j]) || helper(arr[j]+arr[i]))
                          return true;
            }
        }
        return false;
    }
      
      static boolean helper(String s){
          
          int i=0;
          int j=s.length()-1;
          while(i<=j)
          {
              if(s.charAt(i)!=s.charAt(j))
                   return false;
                   
                   i++;
                   j--;
          }
          
          return true;
      }
}

