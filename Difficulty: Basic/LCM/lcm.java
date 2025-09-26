class Solution {
    public static int LCM(int a, int b) {

        // write your code here
        int ans = a>b? a:b;
        while(true){
            if(ans%a==0 && ans%b==0){
                break;
            }
            ans++;
        }
        return ans;
        // return LCM of a and b
    }
}