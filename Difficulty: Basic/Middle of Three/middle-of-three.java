// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        // code here
          // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(a);
        list.add(b);
        list.add(c);
        
        Collections.sort(list);
        return list.get(1);
    }
}