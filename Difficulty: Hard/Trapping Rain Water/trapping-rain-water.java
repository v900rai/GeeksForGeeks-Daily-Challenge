

class Solution {
 public int maxWater(int arr[]) {
        int n=arr.length;
        int left[]=new int[n];
        int rigth[]=new int [n];
         left[0]=arr[0];
        for(int i=1; i<n; i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        rigth[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            rigth[i]=Math.max(rigth[i+1],arr[i]);
        }
        int result=0;
        for(int i=0; i<n; i++){
            result+=(Math.min(left[i] ,rigth[i])-arr[i]);
        }
        return result;
   /* 
    public int maxWater(int arr[]) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n]; // Corrected spelling of 'right'

        // Build the left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        // Build the right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) { // Corrected condition (if applicable)
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        // Calculate the trapped water
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.min(left[i], right[i]) - arr[i];
        }

        return result;*/
    }
}

    

