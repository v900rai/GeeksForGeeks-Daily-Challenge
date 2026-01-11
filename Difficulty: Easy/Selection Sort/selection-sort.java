class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int smallest =i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest] >arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]  = temp;
            
        }
    }
}