
class Solution {
   public void sort012(int[] arr) {
    int left=0;
    int right=arr.length-1;
    int mid=0;
    while (mid <= right) {
        if (arr[mid] == 0) {
            // Swap arr[left] and arr[mid]
            int temp = arr[left];
            arr[left] = arr[mid];
            arr[mid] = temp;
            left++;
            mid++;
        } else if (arr[mid] == 1) {
            // Move mid forward
            mid++;
        } else if (arr[mid] == 2) {
            // Swap arr[mid] and arr[right]
            int temp = arr[mid];
            arr[mid] = arr[right];
            arr[right] = temp;
            right--;
        }
    }
}


}


        
    




