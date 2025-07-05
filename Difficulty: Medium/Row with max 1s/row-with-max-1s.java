



// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        int index=-1;
        int n=arr.length;
        int m=arr[0].length;
        int j=m-1;
        
        for(int i=0; i<n; i++){
            while(j>=0 && arr[i][j]==1){
                j--;//move to left if you find one
                index=i;// update 
            }
        }
        
        return index;
    }
}