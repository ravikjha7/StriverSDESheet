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
    
    static boolean isBiPartite(ArrayList<Integer> adj[], int n) {
        
        int color[] = new int[n];
        
        for(int i = 0; i < n; i++) color[i] = -1;
        
        for(int i = 0; i < n; i++) {
            
            if(color[i] == -1) {
                Queue<Pair> q = new ArrayDeque<>();
                q.add(new Pair(i, 0));
                
                while(!q.isEmpty()) {
                    
                    int node = q.peek().f;
                    int par = q.poll().s;
                    
                    for(int j : adj[node]) {
                        if(color[j] == -1) {
                            if(par == 0) {
                                color[j] = 1;
                                q.add(new Pair(j, 1));
                            } else {
                                color[j] = 0;
                                q.add(new Pair(j, 0));
                            }
                        } else if(color[j] == par) return false;
                    }
                    
                }
                
                
            }
        }
        
        return true;
        
    }

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> graph) {

        int n = graph.size();
        
        ArrayList<Integer> adj[] = new ArrayList[n];
        
        for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(graph.get(i).get(j) == 1) {
                    adj[i].add(j);
                    adj[j].add(i);
                }
            }
        }
        
        if(!isBiPartite(adj, n)) return false;
        return true;
    }
}
