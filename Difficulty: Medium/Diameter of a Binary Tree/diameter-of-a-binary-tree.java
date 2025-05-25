/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    private int height(Node root,int[] ans){
        if(root==null)return 0;
        int left=height(root.left,ans);
        int right=height(root.right,ans);
        ans[0]=Math.max(ans[0],left+right);
        return Math.max(left,right)+1;
    }
    int diameter(Node root) {
        int maxDiameter[]=new int[1];
        height(root,maxDiameter);
        return maxDiameter[0];
    }
}