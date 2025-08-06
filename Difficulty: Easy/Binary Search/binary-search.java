class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==k){
                result =  mid;
                end = mid-1;
            }
            else if(arr[mid]<k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return result;
    }
}

