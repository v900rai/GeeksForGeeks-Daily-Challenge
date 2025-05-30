

// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
         HashMap<Integer, Integer> hp = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(hp.containsKey(arr[i])){
                min = Math.min(min,hp.get(arr[i]));
            } else {
                hp.put(arr[i], i+1);
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
