class Solution {
    public void sortStack(Stack<Integer> st) {
       ArrayList<Integer> a =new ArrayList<>();
       
       while(!st.empty())
       {
           a.add(st.pop());
       }
       Collections.sort(a);
       for(int x:a)
       {
           st.push(x);
       }
        
    }
}