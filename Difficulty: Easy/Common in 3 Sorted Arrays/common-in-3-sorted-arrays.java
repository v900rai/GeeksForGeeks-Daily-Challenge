class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
       Map<Integer,Integer> mp = new TreeMap<>();
       
       HashSet<Integer> h1 = new HashSet<>(arr1);
       HashSet<Integer> h2 = new HashSet<>(arr2);
       HashSet<Integer> h3 = new HashSet<>(arr3);
        for(int i :h1){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i :h2){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        
        for(int i :h3){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        
        List<Integer> res= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue()==3){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}

