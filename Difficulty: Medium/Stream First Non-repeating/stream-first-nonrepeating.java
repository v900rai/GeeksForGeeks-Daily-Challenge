class Solution {
    public String firstNonRepeating(String s) {
        // code here

        // har character ki frequency store karne ke liye array
        int[] freq = new int[26];

        // characters ka order maintain karne ke liye queue
        Queue<Character> q = new LinkedList<>();

        // final answer store karne ke liye StringBuilder
        StringBuilder ans = new StringBuilder();

        // string ke har character par loop
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // current character ki frequency badhao
            freq[ch - 'a']++;

            // queue me character add karo
            q.add(ch);

            // jab tak queue ka front repeating hai, use hatao
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            // agar queue khali ho gayi
            if (q.isEmpty()) {
                ans.append('#');
            } 
            // warna queue ka front hi first non-repeating character hoga
            else {
                ans.append(q.peek());
            }
        }

        return ans.toString();
    }
}