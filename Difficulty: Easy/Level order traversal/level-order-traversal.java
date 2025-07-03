/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        // push root to q
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> list = new ArrayList<>();
            // get the size of q for ittration
            int qlen = q.size();
            for(int i=0;i<qlen;i++)
            {
                if(q.peek().left != null)
                {
                    q.add(q.peek().left);
                }
                if(q.peek().right != null)
                {
                    q.add(q.peek().right);
                }
                // add the front val or q.val to list to get lvl order
                list.add(q.poll().data);
            }
            // add the list to res
            res.add(list);
        }
        
        return res;
    }
}
 