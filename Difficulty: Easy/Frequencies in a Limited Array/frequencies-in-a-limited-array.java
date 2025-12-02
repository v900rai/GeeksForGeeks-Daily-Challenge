

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
   public List<Integer> frequencyCount(int[] arr) {
        TreeMap<Integer , Integer> map = new TreeMap<>();
        int x =1;
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int value = map.getOrDefault(key,0)+1;
            map.put(key,value);
            
            if(!map.containsKey(x))
                map.put(x,0);
            
            x++;
        }
        
        List<Integer> ll = new ArrayList<>(map.values());
        return ll;
    
    }
}
