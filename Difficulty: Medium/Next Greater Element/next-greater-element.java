class Solution {
    
    public ArrayList<Integer> nextLargerElement(int[] a) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int[] ans = new int[a.length];

        // solve

        for (int i = a.length; i > 0; i--) {
            int temp = a[i - 1];
            while (!st.isEmpty() && st.peek() <= temp) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i - 1] = -1;
            } else {
                ans[i - 1] = st.peek();
            }
            st.push(temp);
        }
        for (int val : ans) {
            res.add(val);
        }
        return res;
        
    }
}
 

