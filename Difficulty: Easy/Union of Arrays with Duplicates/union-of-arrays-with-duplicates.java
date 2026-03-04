class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // Using HashSet to remove duplicates
        ArrayList<Integer> result;
        HashSet<Integer> set = new HashSet<>();
        for(int nums : a){
            set.add(nums);
        }
        for(int nums : b){
            set.add(nums);
        }
         result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }
}