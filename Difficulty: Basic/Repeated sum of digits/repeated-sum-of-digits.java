// User function Template for Java
class Solution {
    static int repeatedSumOfDigits(int nums) {
        // code here
        if(nums==0){
            return 0;
        }
        if(nums%9==0){
            return 9;
        }
        else{
            return nums%9;
        }
    }
}
