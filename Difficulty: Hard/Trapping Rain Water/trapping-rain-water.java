/*class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        
        int left[] = new int [n];
        int right[] = new int [n];
        
         left[0] = arr[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
            
        }
        right[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int result = 0;
        for(int i=0; i<n; i++){
            result = result+(Math.min(left[i],right[i])- arr[i]);
        }
        return result;
    }
}
*/

class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        
        int left = 0;
        int right = n - 1;
        
        int leftMax = 0;
        int rightMax = 0;
        
        int result = 0;
        
        while(left <= right){
            
            if(arr[left] <= arr[right]){
                
                if(arr[left] >= leftMax){
                    leftMax = arr[left];
                }else{
                    result += leftMax - arr[left];
                }
                left++;
                
            }else{
                
                if(arr[right] >= rightMax){
                    rightMax = arr[right];
                }else{
                    result += rightMax - arr[right];
                }
                right--;
            }
        }
        return result;
    }
}