

// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int n = arr.length;

// LOWER BOUND
        int low=0;
        int high=n-1;
        int ans[] = {-1,-1};
        Arrays.sort(arr);
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                ans[0] = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

//UPPER BOUND 
        low= 0;
        high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans[1] = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return ans;


    }
}
