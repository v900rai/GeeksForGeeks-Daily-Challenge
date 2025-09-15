



// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
   /* static void rotateArr(int arr[], int d) {
        d=d%arr.length;
        if(d==0)
            return;//no rotation needed if d is 0
        
        rotate(arr, 0,d-1);//revers the first d element thik h 
        rotate(arr,d,arr.length-1); // then revers the remaining element
        
        rotate(arr,0,arr.length-1);// uske bad revers the entire arrays
        
    }*/
    public static void rotate(int arr[], int left , int right){
        while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        }
    }
    static void rotateArr(int arr[], int d){
        d=d%arr.length;
        if(d==0){
            return ;
        }
        rotate(arr ,0, d-1);
        rotate(arr,d,arr.length-1);
        rotate(arr,0,arr.length-1);
    }
}