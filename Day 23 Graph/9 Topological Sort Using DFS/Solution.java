import java.util.*;

public class Solution 
{
    
    static void dfs(int node, ArrayList<Integer> adj[], int vis[], ArrayList<Integer> ans) {
        vis[node] = 1;
        
        for(int i : adj[node]) {
            if(vis[i] == 0) {
                dfs(i, adj, vis, ans);
            }
        }
        ans.add(node);
    }
    
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int n, int e) 
    {
        ArrayList<Integer> adj[] = new ArrayList[n];
        for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < edges.size(); i++) {
            adj[edges.get(i).get(0)].add(edges.get(i).get(1));
        }
        
        int []vis = new int[n];
        
        for(int i = 0; i < n; i++) {
            if(vis[i] == 0) {
                dfs(i, adj, vis, ans);
            }
        }
        
        Collections.reverse(ans);
        
        return ans;
        
    }
}
