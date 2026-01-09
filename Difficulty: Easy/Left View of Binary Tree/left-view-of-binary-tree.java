





// User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/


class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result; // If the tree is empty, return an empty list
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root); // Start with the root node
        
        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of nodes at the current level
            
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                
                // Add the first node of each level to the result
                if (i == 0) {
                    result.add(current.data);
                }
                
                // Add left and right children of the current node to the queue
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        
        return result; // Return the result list containing the left view
    }
}
