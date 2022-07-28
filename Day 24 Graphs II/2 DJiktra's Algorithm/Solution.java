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
	
	public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int n, int edges, int source){
        
		Queue<Integer> s = new ArrayDeque<>();
        
        ArrayList<Pair> adj[] = new ArrayList[n];
        for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        
        for(int i = 0; i < vec.size(); i++) {
            adj[vec.get(i).get(0)].add(new Pair(vec.get(i).get(1), vec.get(i).get(2)));
            adj[vec.get(i).get(1)].add(new Pair(vec.get(i).get(0), vec.get(i).get(2)));
        }
        
        ArrayList<Integer> dis = new ArrayList<>();
        for(int i = 0; i < n; i++) dis.add(Integer.MAX_VALUE);
        
        dis.set(source, 0);
        s.add(source);
        
        while(!s.isEmpty()) {
            int node = s.poll();
                int curr = dis.get(node);
                for(Pair i : adj[node]) {
                    if(dis.get(i.v) > curr + i.w) {
                        dis.set(i.v, curr + i.w);
                        s.add(i.v);
                    }
                }
        }
        
        return dis;
        
	}
}
