class Solution {
    static int closestNumber(int n, int m) {
        // code here
        int ans = Integer.MIN_VALUE;
        int countf = 0;
        int temp = n;
        int counts = 0;
        while(true) {
            counts++;
            if(temp %m == 0) {
                if(Math.abs(ans) < Math.abs(temp)) {
                    ans = temp;
                }
                break;
            }
            temp++;
        }
        temp = n;
        while(true) {
            countf++;
            if(temp %m ==0) {
                if(countf < counts) {
                    ans = temp;
                } else if(countf == counts && Math.abs(ans) < Math.abs(temp)) {
                    ans = temp;
                }
                break;
            }
            temp--;
        }

        return ans;
    }
}