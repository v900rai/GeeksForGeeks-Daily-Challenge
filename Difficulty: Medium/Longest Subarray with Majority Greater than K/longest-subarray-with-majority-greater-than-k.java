
// User function Template for Java
class Solution {
    static int longestSubarray(int[] arr, int k) {
	   int[] change = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>k) {
            	change[i]=1;
            }
            else {
            	change[i]=-1;
            }
        }
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, -1);        
        int maxLength = 0;

        for (int i = 0; i < change.length; i++) {
            prefixSum += change[i];
            if (prefixSum > 0) {
                maxLength = Math.max(maxLength, i + 1);
            } else {
                if (prefixMap.containsKey(prefixSum - 1)) {
                    maxLength = Math.max(maxLength, i - prefixMap.get(prefixSum - 1));
                }
            }
            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }
        return maxLength;
	}
}

