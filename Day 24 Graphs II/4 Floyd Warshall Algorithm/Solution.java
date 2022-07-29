import java.util.ArrayList;

public class Solution {
  static int floydWarshall(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
      
      int dis[][] = new int[n + 1][n + 1];
    
      for(int i = 1; i <= n; i++) {
          for(int j = 1; j <= n; j++) {
              if(i != j)
              dis[i][j] = (int)1e9;
          }
      }
      
       for(int i = 0; i < edges.size(); i++) {
           dis[edges.get(i).get(0)][edges.get(i).get(1)] = edges.get(i).get(2);
       }
      
      for(int k = 1; k <= n; k++) {
          for(int i = 1; i <= n; i++) {
              for(int j = 1; j <= n; j++) {
                  if(dis[i][k] != 1e9 && dis[k][j] != 1e9)
                  dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
              }
          }
      }
      return dis[src][dest];
  }

}
