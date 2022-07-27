import java.util.*;

public class Solution 
{
    
    static void bfs(ArrayList<Integer> adj[], int inDegree[], ArrayList<Integer> ans, Queue<Integer> q) {
        // System.out.println("No Error Till Now");
        while(!q.isEmpty()) {
            int node = q.poll();
            for(int i : adj[node]) {
                inDegree[i]--;
                if(inDegree[i] == 0) {
                    q.add(i);
                    ans.add(i);
                }
            }
        }
        // System.out.println("No Error Till Now");
    }
    
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int n, int e) 
    {
        ArrayList<Integer> adj[] = new ArrayList[n];
        for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        int inDegree[] = new int[n];
        
        for(int i = 0; i < edges.size(); i++) {
            adj[edges.get(i).get(0)].add(edges.get(i).get(1));
            inDegree[edges.get(i).get(1)]++;
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++) {
            if(inDegree[i] == 0) {
                q.add(i);
                ans.add(i);
            }
        }
        
        bfs(adj, inDegree, ans, q);
        // System.out.println("No Error Till Now fff 3");
        return ans;
        
    }
}
