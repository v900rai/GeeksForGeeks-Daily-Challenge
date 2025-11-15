// User function Template for Java

// arr[]: input array
// n: size of array
// x: element for which you need to find smaller than x
class Solution {
    public static int smallerThanX(int arr[], int n, int x) {
        // Your code here
           int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                count++;
            }
        }
        return count;
    }
}