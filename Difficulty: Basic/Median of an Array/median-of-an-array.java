class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2==0){
            int mid = arr.length/2;
            double sum = (double)(arr[mid] +arr[mid-1])/2;
            return sum;
        }
        return arr[arr.length/2];
    }
}