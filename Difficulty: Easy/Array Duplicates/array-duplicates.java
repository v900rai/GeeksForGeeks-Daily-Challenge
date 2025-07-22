class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
      
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i: arr){
            int count = m.getOrDefault(i,0);
            m.put(i, count+1);
            if(count>=1){
                ans.add(i);
            }
        }

        return ans;
    }
}