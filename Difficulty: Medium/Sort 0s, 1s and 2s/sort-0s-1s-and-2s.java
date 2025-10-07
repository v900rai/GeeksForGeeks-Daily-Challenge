class Solution {
    public void sort012(int[] arr) {
        // code here
       int count0=0;
       int count1=0;
       int count2=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               count0++;
               
           }
           else if(arr[i]==1){
               count1++;
           }
           else{
               count2++;
           }
       }
       int k=0;
       while(count0>0){
           arr[k]=0;
           k++;
           count0--;
       }
       while(count1>0){
           arr[k]=1;
           k++;
           count1--;
       }
       while(count2>0){
           arr[k]=2;
           k++;
           count2--;
       }
    }
}