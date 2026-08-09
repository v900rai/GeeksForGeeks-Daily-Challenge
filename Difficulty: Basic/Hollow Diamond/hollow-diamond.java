class Solution {
    void printPat(int n) {
        for(int i = 1;i<=n;i++){
            int spaces = n-i;
            int hollowSpaces = 2*i - 3;
            if(i == 1){
                System.out.println("  ".repeat(spaces)+"*");
            }
            else{
                System.out.println("  ".repeat(spaces)+"* "+"  ".repeat(hollowSpaces)+"*");
        
            }    
        }
        
        for(int i = n-1;i>0;i--){
            int spaces = n-i;
            int hollowSpaces =2*i -3;
            if(i == 1){
                System.out.println("  ".repeat(spaces)+"*");
            }
            else{
                System.out.println("  ".repeat(spaces)+"* "+"  ".repeat(hollowSpaces)+"*");
        
            }
        }
    }
}