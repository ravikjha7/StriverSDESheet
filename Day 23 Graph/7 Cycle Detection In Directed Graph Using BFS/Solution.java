import java.util.*;

public class Solution {
    
    static int count = 0;
    
    static void bfs(ArrayList<Integer> adj[], int inDegree[], Queue<Integer> q) {
        while(!q.isEmpty()) {
            count++;
            int node = q.poll();
            //System.out.println("Node : " + node);
            for(int j : adj[node]) {
                //System.out.println(j);
                inDegree[j]--;
                if(inDegree[j] == 0) q.add(j);
            }
        }
    }
    
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> p) {
    ArrayList<Integer> adj[] = new ArrayList[n + 1];
        
        for(int i = 0; i <= n; i++) adj[i] = new ArrayList<>();
        
        int []inDegree = new int[n + 1];
      
          count = 0;
        
        for(int i = 0; i < p.size(); i++) {
            adj[p.get(i).get(0)].add(p.get(i).get(1));
            inDegree[p.get(i).get(1)]++;
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i = 1; i <= n; i++) {
            if(inDegree[i] == 0) {
                q.add(i) ;
            }
        }
        
        bfs(adj, inDegree, q) ;
        
        //System.out.println(count);
        
        if(count == n) return false;
        return true;
  }
}
