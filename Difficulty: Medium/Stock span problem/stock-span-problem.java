
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            // removing <= ele from stack for the find of previous highest ele
            while(st.size() > 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            
            if(st.size() == 0) { // id stack is empty 
                ans.add(i+1);
            }
            else {
                ans.add(i - st.peek());
            }
            
            st.push(i);
        }
        
        return ans;
    }
}