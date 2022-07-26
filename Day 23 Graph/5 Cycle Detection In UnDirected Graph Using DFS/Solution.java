import java.util.*;

class Pair {
        int f;
        int s;
        Pair(int a, int b) {
            f = a;
            s = b;
        }
    }

public class Solution {
    
    static boolean dfs(int node, int par, ArrayList<Integer> adj[], int vis[]) {
        vis[node] = 1;
        for(int i : adj[node]) {
            if(vis[i] == 0) 
            {
                if(!dfs(i, node, adj, vis)) return false;
            }
            else if(i != par) return false;
        }
        return true;
    }
    
    public static String cycleDetection(int[][] p, int n, int m) {
        ArrayList<Integer> adj[] = new ArrayList[n + 1];
        
        for(int i = 0; i <= n; i++) adj[i] = new ArrayList<>();
        
        // System.out.println("Hii");
        
        for(int i = 0; i < p.length; i++) {
            adj[p[i][0]].add(p[i][1]);
            adj[p[i][1]].add(p[i][0]);
        }
        
        // System.out.println("Hii");
        
        int vis[] = new int[n + 1];
        
        for(int i = 1; i <= n; i++) {
            if(vis[i] == 0) {
                if(!dfs(i, -1, adj, vis)) return "Yes";
            }
        }
        return "No";
    }
    
}
