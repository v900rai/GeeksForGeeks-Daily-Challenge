
class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        int count=0;
        double sum=0.0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                count++;
                sum += arr[i];
            }
        }
        return (sum/count);
    }
}