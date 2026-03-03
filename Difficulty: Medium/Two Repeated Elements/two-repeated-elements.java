class Solution {
    public int[] twoRepeated(int[] nums) {
       int[] arr = new int[2];
       int count =0;
       HashSet<Integer>set = new HashSet<>();
       for(int i = 0;i<nums.length;i++){
           if(set.contains(nums[i])){
               arr[count] = nums[i];
               count++;
           }
           
           else{
               set.add(nums[i]);
           }
       }
       
       return arr;
        
    }
}

