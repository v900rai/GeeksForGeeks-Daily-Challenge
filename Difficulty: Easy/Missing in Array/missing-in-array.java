
class Solution{
    int missingNum(int arr[]){
        Arrays.sort(arr);
        int count =1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == count){
                count++;
            }
        }
        return count;
    }
}
