import java.util.*;

class Pair {
    int w;
    int n;
    Pair(int a, int b) {
        w = a;
        n = b;
    }
}

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> g)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int key[] = new int[n + 1];
        boolean mst[] = new boolean[n + 1];
        
        for(int i = 1; i <= n; i++) {
            key[i] = (int)1e8;
            mst[i] = false;
        }
        
        ArrayList<Pair> adj[] = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        
        for(int i = 0; i < g.size(); i++) {
            adj[g.get(i).get(0)].add(new Pair(g.get(i).get(1), g.get(i).get(2)));
            adj[g.get(i).get(1)].add(new Pair(g.get(i).get(0), g.get(i).get(2)));
        }
        
        key[1] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((Pair a, Pair b) -> a.w - b.w);
        pq.add(new Pair(0, 1));
        
        HashMap<Integer, Pair> hm = new HashMap<>();
        
        while(!pq.isEmpty()) {
            int u = pq.poll().n;
            mst[u] = true;
            // System.out.print(u + " ");
            for(Pair j : adj[u]) {
                int node = j.w;
                int weight = j.n;
                if(!mst[node] && key[node] > weight) {
                    key[node] = weight;
                    pq.add(new Pair(weight, node));
                    hm.put(node, new Pair(u, weight));
                }
            }
          
        }
        // System.out.println();
        for(int k : hm.keySet()) {
                ArrayList<Integer> curr = new ArrayList<>();
                Pair v = hm.get(k);
                curr.add(v.w);
                curr.add(k);
                curr.add(v.n);
                ans.add(curr);
            // System.out.println(v.w + " " + k + " " + v.n);
            }
        // System.out.println();
        return ans;
    }
}
