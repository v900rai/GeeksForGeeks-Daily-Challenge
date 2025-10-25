class Solution {
    public String average(int arr[]) {
        
        long sum=0;
        for(int i=0;i<arr.length;i++ ){
            sum = sum + arr[i];
        }
       double avg = (double)sum/arr.length;
    return String.format("%.2f",avg);
        
    }
}   