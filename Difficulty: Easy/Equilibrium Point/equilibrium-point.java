class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalsum=0;
        int left_sum =0;
        int right_sum=0;
        
    // taking an totalsum variable to save the sum of the number 
        for(int i =0; i<arr.length; i++){
             totalsum +=arr[i];
        }
    // taking an variable rightsum to store value of the right part of an array
    // give the right sum 
        for(int i=0; i<arr.length; i++){
        right_sum = totalsum-left_sum-arr[i];
        
    //check the value of right equal to left or not    
        if (left_sum==right_sum){
            return i;
        }
    // most imp part store the value of the left part to check the iteration
    //the line 16 directly praportional toh line 24
         left_sum +=arr[i];
        }
          return -1;
        }
    }

 