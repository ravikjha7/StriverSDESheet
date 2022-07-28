import java.util.*;

public class Solution {
    
    static void dfs(int node, ArrayList<Integer> adj[], int vis[], Stack<Integer> s) {
        vis[node] = 1;
        for(int i : adj[node]) {
            if(vis[i] == 0) {
                dfs(i, adj, vis, s);
            }
        }
        s.push(node);
    }
    
    static void dfs2(int node, ArrayList<Integer> adj[], int vis[], List<Integer> curr) {
        vis[node] = 1;
        curr.add(node);
        for(int i : adj[node]) {
            if(vis[i] == 0) {
                dfs2(i, adj, vis, curr);
            }
        }
    }
    
    static void topoSort(ArrayList<Integer> adj[], int vis[], int n, Stack<Integer> s) {
        for(int i = 0; i < n; i++) {
            if(vis[i] == 0) {
                dfs(i, adj, vis, s);
            }
        }
    }

    public static List<List<Integer>> stronglyConnectedComponents(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) ans.add(new ArrayList<>());
        
        ArrayList<Integer> adj[] = new ArrayList[n];
        for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        
        for(int i = 0; i < edges.length; i++) {
            adj[edges[i][0]].add(edges[i][1]);
        }
        
        // System.out.println("I Am Here");
        
        int vis[] = new int[n];
        
        Stack<Integer> s = new Stack<>();
        
        // Topological Sort
        topoSort(adj, vis, n, s);
        
        // System.out.println("I Am Here 2");
        
        // Transpose
        ArrayList<Integer> adj2[] = new ArrayList[n];
        
        for(int i = 0; i < n; i++) adj2[i] = new ArrayList<>();
        
        for(int i = 0; i < edges.length; i++) {
            adj2[edges[i][1]].add(edges[i][0]);
        }
        
         // System.out.println("I Am Here 3");
        
        for(int i = 0; i < n; i++) vis[i] = 0;
        
        while(!s.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            int node = s.pop();
            if(vis[node] == 0) {
                dfs2(node, adj2, vis, curr);
                ans.add(curr);
            }
        }
        return ans;
    }
}
