class Solution {
    boolean isBinary(String str) {
        // Your code here
        boolean flag= true;

int n=str.length();



for(int i=0; i< n; i++){

  char   ch= str.charAt(i);

     if(ch== '1' || ch == '0')

    flag= true;

    else {

          flag = false; 

          break;

      }

   }

   return flag;

    }
}