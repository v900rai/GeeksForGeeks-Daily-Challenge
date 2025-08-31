

// User function Template for Java

class Solution {
    public int maxWater(int arr[]) {
           
        int left =0;
        int right = arr.length-1;
        int maxWater = 0;
        while(left<right){
            int width = right-left;
            // width niksl diya hu 
            
            int height = Math.min(arr[left],arr[right]);
            // heigth bhi niksl gys h 
            
            int currentWater = width*height;
            // current watter bhi naikal diya hu 
            
            maxWater = Math.max(maxWater,currentWater);
            // maximum watter bhi nikal diya hu 
            
            if(arr[left]<arr[right]) 
            left++;
            
            
            else
            right--;
        }
        return maxWater;
        
    }
}