class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        if(arr.length<3){
            return -1;
        }
        Arrays.sort(arr);
        int large =arr.length-3;
        return arr[large];
    }
}