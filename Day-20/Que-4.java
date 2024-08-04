// GFG : Graph cycle detection in undirected graph

import java.util.ArrayList;

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int size = adj.size();
        boolean vis[] = new boolean[size];
        int curr = 0;
        vis[curr] = true;
        
        for(int i=0 ; i<V ; i++){
            if(vis[i]==false){
                if(check(i,-1,vis,adj)) return true;
            }
            
        }
            return false;
        
    }
    
    public boolean check(int node,int parent,boolean vis[] , ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        for(Integer it : adj.get(node)){
            if(vis[it]==false){
                if(check(it,node,vis,adj)==true) return true;
            }
            else if(it != parent){
                return true;
            }
            
        }
            return false;
    }
}