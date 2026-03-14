/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    
    public boolean isBST(Node root) {
        // BST check karne ke liye initial range:
        // minimum possible value se maximum possible value tak
        return bst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean bst(Node root, long min, long max) {
        // Base case:
        // agar node null hai, to valid BST mana jayega
        if (root == null) {
            return true;
        }

        // Current node ki value allowed range ke andar honi chahiye
        if (root.data <= min || root.data >= max) {
            return false;
        }

        // Left subtree ke liye max current node ki value hogi
        // Right subtree ke liye min current node ki value hogi
        return bst(root.left, min, root.data) &&
               bst(root.right, root.data, max);
    }
}