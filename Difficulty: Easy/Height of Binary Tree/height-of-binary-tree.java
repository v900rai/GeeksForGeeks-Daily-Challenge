/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node node) {
         if(node==null)
          return -1;
       // return Math.max(height(node.left),height(node.right))+1;
        return Math.max(height(node.left) , height(node.right))+1;
        
    }
}