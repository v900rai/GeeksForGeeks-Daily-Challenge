/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static class pair{
    int state;
    Node root;
    pair(Node root,int state)
    {
        this.state = state;
        this.root = root;
    }
 }
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList();
        if(root == null) return null;
        Queue<pair> q = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new pair(root,0));
        while(!q.isEmpty())
        {
            pair it = q.remove();
            int hd = it.state;
            Node temp = it.root;
            if(map.get(hd) == null)
            {
                map.put(hd,temp.data);
            }
            if(temp.left != null)
            {
                q.add(new pair(temp.left,hd-1));
            }
            if(temp.right != null)
            {
                q.add(new pair(temp.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            res.add(e.getValue());
        }

        return  res;
    }
}