class Solution {
    public void sortInWave(int arr[]) {
        for(int i=1; i<arr.length; i+=2){
             int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
         
        }
        
    }
}
