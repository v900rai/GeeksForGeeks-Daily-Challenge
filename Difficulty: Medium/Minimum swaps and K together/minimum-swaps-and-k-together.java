// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
 
int minSwap(int[] a, int k) {
        int total = 0;
        int temp = 0;
        int max = 0;
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i]<=k){
                total++;
                temp++;
            }else{
                max = Math.max(temp, max);
                temp = 0;
            }
        }
        return total == temp ? 0 : total - max;
    }
}
