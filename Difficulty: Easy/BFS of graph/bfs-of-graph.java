
// User function Template for Java


class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>(); // BFS traversal result
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS
        boolean[] visited = new boolean[adj.size()]; // Visited array
        
        // Starting BFS from node 0 (Assuming 0-based indexing)
        queue.add(0);
        visited[0] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll(); // Remove front element
            result.add(node); // Add to result
            
            // Traverse all adjacent nodes
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        
        return result;
    }
}


