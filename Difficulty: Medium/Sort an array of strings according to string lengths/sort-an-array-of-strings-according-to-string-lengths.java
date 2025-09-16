class Solution {
    public void sortByLength(String[] arr) {
        // code here
           Arrays.sort(arr, (a,b)->Integer.compare(a.length(), b.length()));
    }
}
