// User function Template for Java

class Solution {
    static int Search(int arr[], int target) {
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
        
    }
}
