class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // Using HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for(int nums : a){
            set.add(nums);
        }
        for(int nums : b){
            set.add(nums);
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }
}