class Solution {
    public boolean isPower(int X, int Y) {
        // code here
          if (X == 1){
           return (Y==1);
       }
       while(Y % X == 0){

           Y/=X;
           
       }
       return (Y==1);
    }
}