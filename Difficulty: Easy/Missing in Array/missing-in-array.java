class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        int count=1;
        
        //traversal whole loop
        
      for(int i=0; i<arr.length; i++){
          if(count == arr[i]){
              count++;
          }
      }
      return count;
    }
}