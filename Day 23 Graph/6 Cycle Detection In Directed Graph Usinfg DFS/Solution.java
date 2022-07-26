import java.util.*;

public class Solution {
    
    static boolean dfs(int node, int[] vis, int[] dfsvis, ArrayList<Integer> adj[]) {
        vis[node] = 1;
        dfsvis[node] = 1;
        for(int i : adj[node]) {
            if(vis[i] == 0) 
            {
                if(dfs(i, vis, dfsvis, adj)) return true;
            } else if(dfsvis[i] == 1) return true;
        }
        dfsvis[node] = 0;
        return false;
    }
    
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> p) {
    ArrayList<Integer> adj[] = new ArrayList[n + 1];
        
        for(int i = 0; i <= n; i++) adj[i] = new ArrayList<>();
        
        int []vis = new int[n + 1];
        int []dfsvis = new int[n + 1];
        
        for(int i = 0; i < p.size(); i++) {
            adj[p.get(i).get(0)].add(p.get(i).get(1));
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            if(vis[i] == 0) {
                if(dfs(i, vis, dfsvis, adj)) return true;
            }
        }
        
        return false;
  }
}
