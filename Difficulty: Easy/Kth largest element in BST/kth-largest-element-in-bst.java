/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public List<Integer> list=new ArrayList<>();
    public void inorder(Node node)
    {
        if(node==null) 
        return ;
        
        inorder(node.left);
        list.add(node.data);
        inorder(node.right);
        
    }
    public int kthLargest(Node root, int k) {
        inorder(root);
        if(k>list.size())
        return 0;
        return list.get(list.size()-k);
        
    }
}