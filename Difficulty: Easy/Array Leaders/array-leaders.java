class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
    
        ArrayList<Integer> list = new ArrayList<>();
        int currSum= arr[arr.length-1];
        for(int i= arr.length-1; i>=0; i--){
            if(currSum <=arr[i]){
                list.add(0,arr[i]);
                currSum =arr[i];
            }
        }
        return list;
        
        
    }
}
