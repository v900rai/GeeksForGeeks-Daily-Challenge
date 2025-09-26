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
    // RADHE RADHE 
    public static int height(Node root , int[] diameter){
        if(root==null){
            return 0 ; 
        }
        
        int lh = height(root.left,diameter);
        int rh = height(root.right,diameter);
        
        diameter[0] = Math.max(diameter[0],lh+rh);
        
        return Math.max(lh,rh)+1 ; 
        
    }
    int diameter(Node root) {
        // Your code here
        
        int[] diameter = new int[1];
        
        height(root,diameter);
        
        return diameter[0] ; 
    }
}

