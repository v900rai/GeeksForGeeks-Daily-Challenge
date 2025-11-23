class Solution {
    public int kthSmallest(int[] arr, int k) {
    Arrays.sort(arr);
    int p = arr[k-1];
    return p;
    }
}


