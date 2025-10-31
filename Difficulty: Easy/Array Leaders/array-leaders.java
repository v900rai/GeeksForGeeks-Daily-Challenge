

 class Solution {
     static ArrayList<Integer> leaders(int arr[]){
         ArrayList<Integer> list = new ArrayList<>();
         
         int curSum =arr[arr.length-1];
         
         for(int i =arr.length-1; i>=0; i--){
             if(curSum <=arr[i]){
                 list.add(0, arr[i]);
                 curSum =arr[i];
             }
         }
         return list;
     }
 }