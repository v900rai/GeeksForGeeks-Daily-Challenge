class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        // Step 1: सारे elements को HashSet में डाल दो
        // ताकि O(1) में search कर सकें
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int ans = 0; // final answer (max length)

        // Step 2: हर element check करो
        for (int i = 0; i < arr.length; i++) {
            
            // Trick: sequence हमेशा "start" number से ही check करेंगे
            // अगर arr[i]-1 set में नहीं है → arr[i] एक नए sequence का start है
            if (!set.contains(arr[i] - 1)) {
                
                int val = arr[i]; // sequence की शुरुआत
                // जब तक अगले consecutive numbers मिल रहे हैं, बढ़ाते जाओ
                while (set.contains(val)) {
                    val++;
                }

                // length = (last_val - starting_val)
                ans = Math.max(ans, val - arr[i]);
            }
        }

        return ans;
    }
}
