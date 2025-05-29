/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution{
    int maxpathlen =0;
    int maxpathsum =Integer.MIN_VALUE;
    public void solve(Node root , int pathlen , int pathsum){
        if(root==null) return;
        pathlen++;
        pathsum+=root.data;
        if(root.left==null && root.right==null){
            if(pathlen>maxpathlen || (pathlen==maxpathlen && pathsum>maxpathsum)){
                maxpathlen = pathlen;
                maxpathsum = pathsum;
            }
        }
        solve(root.left,pathlen,pathsum);
        solve(root.right,pathlen,pathsum);
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        solve(root,0,0);
        return maxpathsum;
    }
}