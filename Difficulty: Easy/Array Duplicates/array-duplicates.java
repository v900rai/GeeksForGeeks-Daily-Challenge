class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
      
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int nums :arr){
            if(set.contains(nums)){
                list.add(nums);
            }
            else{
                set.add(nums);
            }
        }
        return list;
        
    }
}