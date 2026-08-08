class Solution {
    int[] parent;

    int minEdgesReq(int n, int[][] edges) {

        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int connections = 0;

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            
            if (find(u) == find(v)) {
                connections++;
            } else {
                union(u, v);
            }
        }

        int components = 0;
        for (int i = 0; i < n; i++) {
            if (find(i) == i) {
                components++;
            }
        }

        int required = components - 1;

        if (connections < required) {
            return -1;
        }

        return required;
    }

    public void union(int i, int j) {
        int irep = find(i);
        int jrep = find(j);

        parent[irep] = jrep;
    }

    int find(int x) {
        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }
}