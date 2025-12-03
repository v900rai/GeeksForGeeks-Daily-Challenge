
class Solution{
    public static int findMax(Node root){
        //code here
        return root == null ? 0 : Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
    }
    public static int findMin(Node root){
        //code here
       return root == null ? Integer.MAX_VALUE : Math.min(root.data, Math.min(findMin(root.left), findMin(root.right)));
    }
}


