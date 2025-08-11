


/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    boolean chk=true;
    int maxDepth(Node n){
      if(n==null)
      return 0;
      int left=maxDepth(n.left);
      int right=maxDepth(n.right);
      if(Math.abs(left-right)>1){
          chk=false;
          
      }
      return Math.max(left,right)+1;
    }
    public boolean isBalanced(Node root) {
      maxDepth(root);
      return chk;
    }
}