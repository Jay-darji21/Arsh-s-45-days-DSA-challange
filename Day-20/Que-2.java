// GFG : DFS of Graph

import java.util.ArrayList;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        
        dfs(0,adj,vis,ans);
        return ans;
        
    }
    
    public void dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean vis[],ArrayList<Integer> ans){
        vis[v] = true;
        
        ans.add(v);
        
        for(Integer neighbour : adj.get(v)){
            if(!vis[neighbour]){
                dfs(neighbour,adj,vis,ans);
            }
        }
    }
}