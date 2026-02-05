class Solution {
    public int maxOnes(int arr[], int k) {
        //longest sub arrray with atmost k zeroes
        //Two pointer sliding window
        int n = arr.length;
        int left = 0;
        int zeroes = 0;
        int max = 0;
        for(int right = 0;right<n;right++){
            if(arr[right] == 0){
                zeroes++;
            }
            while(zeroes > k){
                if(arr[left] == 0){
                    zeroes--;
                }
                left++;
            }
            if(zeroes<=k){
                int len = right-left+1;
                max = Math.max(max,len);
            }
        }
        return max;
    }
}