class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        for(int i =0;i<n ;i+=k){
            int max = Math.min(i+k-1,n-1);
            int left =i;
            while(left<max){
                int temp = arr[left];
                arr[left]=arr[max];
                arr[max]=temp;
                left++;
                max--;
            }
        }
    }
}