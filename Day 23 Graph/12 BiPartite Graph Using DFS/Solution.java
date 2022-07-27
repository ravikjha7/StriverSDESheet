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
    
    static boolean isBiPartite(int node, ArrayList<Integer> adj[], int par, int color[]) {
        
        for(int i : adj[node]) {
            if(color[i] != par) {
                if(color[i] == -1) {
                    color[i] = par == 0 ? 1 : 0;
                    if(!isBiPartite(i, adj, color[i], color)) return false;
                }
            } else return false;
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
        
        int color[] = new int[n];
        for(int i = 0; i < n; i++) color[i] = -1;
        
        for(int i = 0; i < n; i++) {
            if(color[i] == -1) {
                color[i] = 0;
                if(!isBiPartite(i, adj, 0, color)) return false;
            }
        }
        
        return true;
    }
}
