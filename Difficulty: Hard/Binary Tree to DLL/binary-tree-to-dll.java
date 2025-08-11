/*
class Node {
    int data;
    Node left, right;

    Node() {
        this.data = 0;
        this.left = this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
*/
class Solution {
    // Function to convert binary tree to doubly linked list and return it.
    
    Node prev=null;
    Node bToDLL(Node root) {
        //  Your code here
        if(root == null)
        return root;
        
        Node head=bToDLL(root.left);
        
        if(prev==null)
        {
            head=root;
        }
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        bToDLL(root.right);
        
    
    return head;
}
}