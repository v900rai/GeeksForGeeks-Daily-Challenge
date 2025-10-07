

//User function Template for Jav

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
     public ArrayList<Integer> bottomView(Node root) {
        // Result list to store the bottom view
        ArrayList<Integer> result = new ArrayList<>();
        
        // TreeMap to store the bottom view nodes with horizontal distance as key
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        // Queue for level order traversal
        Queue<Pair> queue = new LinkedList<>();
        
        // Start with the root node at horizontal distance 0
        if (root != null) {
            queue.add(new Pair(root, 0));
        }
        
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.hd; // Horizontal distance
            
            // Update the map with the current node's value
            map.put(hd, node.data);
            
            // Add the left child to the queue with horizontal distance -1
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            
            // Add the right child to the queue with horizontal distance +1
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }
        
        // Extract the values from the map in order of horizontal distance
        for (Integer value : map.values()) {
            result.add(value);
        }
        
        return result; // Return the bottom view
    }
}

// Helper class for storing node and its horizontal distance
class Pair {
    Node node;
    int hd; // horizontal distance
    
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}