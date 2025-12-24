   class Solution {
    int transitionPoint(int arr[]) {
       int left=0,right=arr.length-1,res=-1;
       while(left<=right){
           int mid=left+(right-left)/2;
           if(arr[mid]==1){
               res=mid;
               right=mid-1;
           }else{
               left=mid+1;
           }
       }
       return res;
    }
}