class Solution {
    
    //declaring these globally to access them inside the func.
    ArrayList<Integer> ans;
    boolean[] visited;
    
    public void helper(ArrayList<ArrayList<Integer>> adj, int vertex) {
        //if the vertex is not visited we will not do anything
        if(visited[vertex] == false) {
            ans.add(vertex);
            visited[vertex] = true;
            
            //visiting the neighbours of the vertex
            for(int i=0; i<adj.get(vertex).size(); i++) {
                helper(adj, adj.get(vertex).get(i));
            }
        }
    }
    
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ans = new ArrayList<>();
        visited = new boolean[adj.size()];
        
        helper(adj, 0);
        
        return ans;
    }
}