class Solution {
    public void sortIt(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] nums = new int[n];
        int idx = 0;
        
        for(int i=n-1;i>=0;i--){
            if(arr[i]%2 == 1){
                nums[idx++] = arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                nums[idx++] = arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
        }
    }
}

