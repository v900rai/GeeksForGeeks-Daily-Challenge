/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if(root.left == null && root.right == null) return true;
        boolean ans = dfs(root);
        return ans;
    }
    
    public boolean dfs(Node root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        if(root.left == null) {
            if(root.right.data != root.data) {
                return false;
            }
            return dfs(root.right);
        }
        if(root.right == null) {
            if(root.left.data != root.data) {
                return false;
            }
            return dfs(root.left);
        }
        if(root.left.data + root.right.data != root.data) {
            return false;
        }
        return dfs(root.left) && dfs(root.right);
    }
}