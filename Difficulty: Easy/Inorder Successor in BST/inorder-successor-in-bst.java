/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    Node successor = null;

    public int inorderSuccessor(Node root, Node x) {
        while (root != null) {
            if (x.data >= root.data) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }

        return (successor != null) ? successor.data : -1;
    }
}