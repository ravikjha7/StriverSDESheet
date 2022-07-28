import java.util.*;
class Pair {
    int v;
    int w;
    Pair(int a, int b) {
        v = a;
        w = b;
    }
}

public class Solution {
    
    static void dfs(int node, ArrayList<Pair> adj[], int vis[], Stack<Integer> s) {
        vis[node] = 1;
        for(Pair i : adj[node]) {
            if(vis[i.v] == 0) {
                dfs(i.v, adj, vis, s);
            }
        }
        s.push(node);
    }
    
    static void topoSort(ArrayList<Pair> adj[], int vis[], int n, Stack<Integer> s) {
        for(int i = 1; i <= n; i++) {
            if(vis[i] == 0) {
                dfs(i, adj, vis, s);
            }
        }
    }
    
    static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> vec) {
        
        Stack<Integer> s = new Stack<>();
        
        ArrayList<Pair> adj[] = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        
        for(int i = 0; i < vec.size(); i++) {
            adj[vec.get(i).get(0)].add(new Pair(vec.get(i).get(1), vec.get(i).get(2)));
        }
        
        int vis[] = new int[n + 1];
        
        topoSort(adj, vis, n, s);
        
        ArrayList<Integer> dis = new ArrayList<>();
        for(int i = 0; i <= n; i++) dis.add(1000000000);
        
        dis.set(src, 0);
        
        while(!s.isEmpty()) {
            int node = s.pop();
            if(dis.get(node) != 1000000000) {
                int curr = dis.get(node);
                for(Pair i : adj[node]) {
                    if(dis.get(i.v) > curr + i.w) {
                        dis.set(i.v, curr + i.w);
                    }
                }
            }
        }
        
        return dis.get(dest);
        
    }
    
}
