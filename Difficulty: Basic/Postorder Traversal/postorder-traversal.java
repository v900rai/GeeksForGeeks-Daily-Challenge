/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> al = new ArrayList<>();
        helper(root, al);
        return al;
    }
    static void helper(Node root, ArrayList<Integer> al){
        if(root==null) return;
        helper(root.left, al);
        helper(root.right, al);
        al.add(root.data);
    }
}
 

