// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
         List<List<Integer>> result = new ArrayList<>();
        // code here
          for(int i = 0;i<arr.length;i++){
              for(int j = i;j<arr.length;j++){
                  List<Integer> subArray = new ArrayList<>();
                  for(int k = i;k<=j;k++){
                      subArray.add(arr[k]);
                  }
                 result.add(subArray); 
              }
          }
          return result;
    }
}