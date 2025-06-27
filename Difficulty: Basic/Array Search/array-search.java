

class Solution {

    static int search(int arr[], int x) {
        int num=arr.length;
        for(int i=0; i<num; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
        
    }
}
