// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
         long count =0;
         Arrays.sort(arr);
       for(int i = 0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                 long  currsum = arr[i]+arr[left]+arr[right];
              if(currsum<sum){
                count+=(right - left);
                left++;

              }else {
                right--;
              }
 

            }
       }
       return count;
    }
}
