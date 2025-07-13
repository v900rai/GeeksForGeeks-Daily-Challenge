// User function Template for Java



class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        List<Integer> res = new ArrayList<Integer>(nums.size());
         for(int i = 1; i<= nums.size(); i++){
             if(i == nums.get(i-1))
             res.add(nums.get(i-1));
         }
         return res;
    }
}

