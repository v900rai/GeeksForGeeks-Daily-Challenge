class Solution {
    public int convertFive(int n) {
        // code here
        int final_reasult = 0;
        int fr = 0;
        if(n==0){
            return 5;
        }
        while(n>0){
            int last_digit = n%10;
            if(last_digit==0){
                last_digit = 5;
            }
            final_reasult = final_reasult*10+last_digit;
            n=n/10;
        }

        while(final_reasult>0){
            int ld= final_reasult%10;

            fr = fr*10+ld;
            final_reasult=final_reasult/10;
        }
        return fr;

    }
}