import java.util.*;

public class Solution {
	public static ArrayList<Integer> BFS(int v, int edges[][]){
		ArrayList<Integer> adj[] = new ArrayList[v];
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < v; i++) adj[i] = new ArrayList<Integer>();
        
        for(int i = 0; i < edges[0].length; i++) {
            adj[edges[0][i]].add(edges[1][i]);
            adj[edges[1][i]].add(edges[0][i]);
        }
        
        for(int i = 0; i < v; i++) {
            Collections.sort(adj[i]);
        }
        
        int vis[] = new int[v];
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i = 0; i < v; i++) {
            if(vis[i] == 0) {
                q.add(i);
                vis[i] = 1;
                ans.add(i);
                while(!q.isEmpty()) {
                    int node = q.poll();
                    for(int j : adj[node]) {
                        if(vis[j] == 0) {
                            vis[j] = 1;
                            q.add(j);
                            ans.add(j);
                        }
                    }
                }
            }
        }
        return ans;
	}
}

