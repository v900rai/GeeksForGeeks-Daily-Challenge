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
} */

class Solution {
    int sum = 0;

    public Node transformTree(Node root) {
        dfs(root);
        return root;
    }

    private void dfs(Node node) {
        if (node == null)
            return;

        dfs(node.right);

        int temp = node.data;
        node.data = sum;
        sum += temp;

        dfs(node.left);
    }
}

