class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
  public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]>=a && arr[mid]<=b){
                mid++;
            }
            else if(arr[mid]<a){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=arr[low];
                mid++;
                low++;
            }
            else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=arr[high];
                high--;
            }
        }
    }
}