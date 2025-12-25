// User function Template for Java

class Solution

{

    public int fun(int node, int destination, int K,

    ArrayList<ArrayList<Integer>> adj, int [][] dp){

        int mod = 1000000007;

        if(K == 0){

            if(node == destination) return 1;

            return 0;

        }

        if(K < 0) return 0;

        if(dp[node][K] != -1) return dp[node][K];

        int ans = 0;

        for(Integer elem : adj.get(node)){

            ans =  ((ans % mod) + (fun(elem, destination, K-1, adj, dp)%mod))%mod;

        }

        return dp[node][K] = (int)ans;

    }

    public int MinimumWalk(int[][] graph, int u, int v, int k)

    {

        

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i< graph.length; i++) adj.add(new ArrayList<>());

        for(int i=0; i< graph.length; i++){

            for(int j=0; j< graph[0].length; j++){

                if(graph[i][j] == 1)

                adj.get(i).add(j);

            }

        }

        int [][] dp = new int[graph.length][k+1];

        for(int i=0; i< dp.length; i++){

            for(int j=0; j < dp[0].length; j++) dp[i][j] = -1;

        }

        return fun(u, v, k, adj, dp);

    }

}