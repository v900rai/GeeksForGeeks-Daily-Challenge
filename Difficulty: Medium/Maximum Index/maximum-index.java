class Solution {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] arr) {
        // Your code here
        
        //TC : (N^2)
        //SC : O(1)
        
        // int left=0,right=arr.length-1,n=arr.length;
        // int max=Integer.MIN_VALUE;
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i;j<n;j++)
        //     {
        //         if(arr[i]<=arr[j])
        //             max=Math.max(max,(j-i));
        //     }
        // }
        // return max;
        
        //TC : (N)
        //SC : O(N)
        
        int left=0,right=0,n=arr.length;
        int left_Min_Array[]=new int[n];
        int right_Max_Array[]=new int[n];
        int diff=0,max=Integer.MIN_VALUE;
        
        left_Min_Array[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left_Min_Array[i]=Math.min(left_Min_Array[i-1],arr[i]);
            // if(arr[i]<=left_Min_Array[i-1])
            //     left_Min_Array[i]=arr[i];
            // else
            //     left_Min_Array[i]=left_Min_Array[i-1];
        }
        
        right_Max_Array[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right_Max_Array[i]=Math.max(right_Max_Array[i+1],arr[i]);
            // if(arr[i]>=right_Max_Array[i+1])
            //     right_Max_Array[i]=arr[i];
            // else
            //     right_Max_Array[i]=right_Max_Array[i+1];
        }
        
        while(left<n && right<n)
        {
            if(left_Min_Array[left]<=right_Max_Array[right])
            {
                diff=right-left;
                max=Math.max(max,diff);
                right++;
            }
            else
                left++;
        }
        return max;
    }
}