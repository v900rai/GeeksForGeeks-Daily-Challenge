// User function Template for Java



class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int smallDiff=Integer.MAX_VALUE;
        int diff=0;
        for(int i=0; i<=arr.size()-m; i++){
            diff=arr.get(i+m-1)-arr.get(i);
            smallDiff=Math.min(diff, smallDiff);
        }
        return smallDiff;
    }
}