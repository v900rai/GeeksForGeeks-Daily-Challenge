class Solution {
    int maxLen(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
            if (Sum == 0) {
                maxlen = i + 1; 
            }
            if (map.containsKey(Sum)) {
                maxlen = Math.max(maxlen, i -map.get(Sum));
            } else {
                map.put(Sum, i);
            }
        }

        return maxlen;
    }
}