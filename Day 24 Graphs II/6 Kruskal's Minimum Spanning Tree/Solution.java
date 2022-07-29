import java.util.*;

class Node {
        int u, v, w;
        Node(int a, int b, int c) {
            u = a;
            v = b;
            w = c;
        }
    }

public class Solution {
    static int findPar(int node, int par[]) {
        if(par[node] == node) return node;
        
        return par[node] = findPar(par[node], par);
    }
    
    static void union(int node1, int node2, int par[], int rank[]) {
        int u = findPar(node1, par);
        int v = findPar(node2, par);
        if(rank[u] < rank[v]) par[u] = par[v];
        else if(rank[v] < rank[u]) par[v] = par[u];
        else {
            par[v] = par[u];
            rank[u]++;
        }
    }
    
    
    
    public static int kruskalMST(int n, int m, ArrayList<ArrayList<Integer>> graph) {
        PriorityQueue<Node> pq = new PriorityQueue<>((Node a, Node b) -> a.w - b.w);
        for(int i = 0; i < graph.size(); i++) {
            pq.add(new Node(graph.get(i).get(0), graph.get(i).get(1), graph.get(i).get(2)));
        }
        
        int par[] = new int[n + 1];
        int rank[] = new int[n + 1];
        int cost = 0;
        
        for(int i = 1; i <= n; i++) par[i] = i;
        
        while(!pq.isEmpty()) {
            Node p = pq.poll();
            if(findPar(p.u, par) != findPar(p.v, par)) {
                cost += p.w;
                union(p.u, p.v, par, rank);
            }
        }
        return cost;
    }
}
