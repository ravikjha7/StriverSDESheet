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
        
        Queue<Pair> q = new ArrayDeque<>();
       
        
        for(int it = 1; it <= n; it++) {
        
            if(vis[it] == 1) continue;
             vis[it] = 1;
        q.add(new Pair(it, -1));
            
        while(!q.isEmpty()) {
            int node = q.peek().f;
            int par = q.poll().s;
            
            for(int i : adj[node]) {
                if(vis[i] == 0) {
                    q.add(new Pair(i, node));
                    vis[i] = 1;
                  }
                else if(i != par) return "Yes";
            }
        }
        }
        
        return "No";
    }
    
}
