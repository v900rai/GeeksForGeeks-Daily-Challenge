// User function Template for Java
class Solution {
    static void reArrange(int[] arr, int n) {
        // code here
       int[] arr1=new int[n];
       int odd=1,even=0;
       for(int i=0;i<n;i++){
           if(arr[i]%2==0){
               arr1[even]=arr[i];
               even+=2;
           }else{
               arr1[odd]=arr[i];
               odd+=2;
           }
           arr[i]=0;
       }
       for(int i=0;i<n;i++){
           arr[i]=arr1[i];
       }
    }
};