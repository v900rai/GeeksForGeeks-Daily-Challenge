



class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
         ArrayList<Integer> list =new ArrayList<>();
         int currentSum=arr[arr.length-1];
         for(int i=arr.length-1; i>=0; i--){
             if(currentSum<=arr[i]){
                 list.add(0 ,arr[i]);
                 currentSum=arr[i];
             }
         }
         return list;
    }
}
