class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
         HashMap<Integer, Integer> map = new HashMap<>();
        
        // To count the frequency
        
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        
        for(int ele : arr){
            if(map.get(ele) != k){
                return ele;
            }
        }
        return -1;
    }
}