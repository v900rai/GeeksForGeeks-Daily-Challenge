class Solution {
    
    public int longestCycle(int V, int[][] edges) {
        
        // adjacency list banate hain
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // graph build
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];
        int[] time = new int[V]; // visit time store karega
        
        int maxCycle = -1;
        
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                maxCycle = Math.max(maxCycle, dfs(i, adj, visited, pathVisited, time, 0));
            }
        }
        
        return maxCycle;
    }
    
    private int dfs(int node, ArrayList<ArrayList<Integer>> adj,
                    boolean[] visited, boolean[] pathVisited,
                    int[] time, int step) {
        
        visited[node] = true;
        pathVisited[node] = true;
        time[node] = step;
        
        int maxCycle = -1;
        
        for(int neighbor : adj.get(node)) {
            
            if(!visited[neighbor]) {
                maxCycle = Math.max(maxCycle,
                        dfs(neighbor, adj, visited, pathVisited, time, step + 1));
            }
            
            // cycle detect
            else if(pathVisited[neighbor]) {
                int cycleLength = step - time[neighbor] + 1;
                maxCycle = Math.max(maxCycle, cycleLength);
            }
        }
        
        pathVisited[node] = false; // backtrack
        
        return maxCycle;
    }
}