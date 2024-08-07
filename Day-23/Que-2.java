// 787. Cheapest flights with k stops
// Medium

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // Create graph
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src , int dest , int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Create graph
    public static void createGraph(int flights[][] , ArrayList<Edge> graph[] ){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<Edge>();
        }

        for(int i=0 ; i<flights.length ; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[src].add(new Edge(src,dest,wt));
        }
    }

    // Information class
    static class Info{
        int node;
        int cost;
        int stops;
        Info(int node, int cost , int stops){
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
    }

    // Dijesktra algorithm to find shortest path
    public static int dijkstra(ArrayList<Edge> graph[] , int n , int src ,int dest , int k){
        int dist[] = new int[n];

        for(int i=0 ; i<dist.length ; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        Queue<Info> pq = new LinkedList<>();
        pq.add(new Info(src,0,0));

        while(!pq.isEmpty()){
            Info curr = pq.remove();

            if(curr.stops > k){
                break;
            }

            for(int i=0 ; i<graph[curr.node].size() ; i++){
                Edge e = graph[curr.node].get(i);

                if((curr.cost + e.wt) < dist[e.dest] && curr.stops <= k){
                    dist[e.dest] = curr.cost + e.wt;
                    pq.add(new Info(e.dest,dist[e.dest],curr.stops+1));
                }
            }     
        }
       if(dist[dest] == Integer.MAX_VALUE){
            return -1;
         }

         return dist[dest];

    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights,graph);
        int ans = dijkstra(graph,n,src,dst,k);
        return ans;
    }
}