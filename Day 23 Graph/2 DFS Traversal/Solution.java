import java.util.ArrayList;

public class Solution {
    
    static void dfs(int node, ArrayList<Integer> adj[], int vis[], ArrayList<Integer> curr) {
        vis[node] = 1;
        curr.add(node);
        for(int i : adj[node]) {
            if(vis[i] == 0) {
                dfs(i, adj, vis, curr);
            }
        }
    }
    
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        
        ArrayList<Integer> adj[] = new ArrayList[v];
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < v; i++) adj[i] = new ArrayList<Integer>();
        
        for(ArrayList<Integer> i : edges) {
            adj[i.get(0)].add(i.get(1));
            adj[i.get(1)].add(i.get(0));
        }
        
        int vis[] = new int[v];
        
        for(int i = 0; i < v; i++) {
            
            ArrayList<Integer> curr = new ArrayList<>();
            
            if(vis[i] == 0) {
                dfs(i, adj, vis, curr);
            }
            
            if(curr.size() != 0) ans.add(curr);
        }
        
        return ans;
    }
}
