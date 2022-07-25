import java.util.*;
public class Solution
{
    
    static ArrayList<Integer> vis = new ArrayList<>();
    static int color2 = 0;
    static void dfs(int node, ArrayList<Integer> adj[], int[][] arr) {
        vis.set(node, 1);
        int row = node / arr[0].length;
        int col = node % arr[0].length;
        arr[row][col] = color2;
        for(int i : adj[node]) {
            if(vis.get(i) == 0) dfs(i, adj, arr);
        }
    }
    
    public static int[][] floodFill(int[][] arr, int sr, int sc, int color)
    {
        int m = arr.length;
        int n = arr[0].length;
        ArrayList<Integer> adj[] = new ArrayList[m*n];
        for(int i = 0; i < m*n; i++) adj[i] = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i != 0) {
                    if(arr[i - 1][j] == arr[i][j]) {
                        adj[i*n + j].add((i - 1)*n + j);
                    }
                }
                if(j != 0) {
                    if(arr[i][j - 1] == arr[i][j]) {
                        adj[i*n + j].add(i*n + j - 1);
                    }
                }
                if(i != m - 1) {
                    if(arr[i + 1][j] == arr[i][j]) {
                        adj[i*n + j].add((i + 1)*n + j);
                    }
                }
                if(j != n - 1) {
                    if(arr[i][j + 1] == arr[i][j]) {
                        adj[i*n + j].add(i*n + j + 1);
                    }
                }
            }
        }
        int src = sr*n + sc;
        color2 = color;
        vis = new ArrayList<>();
        for(int i = 0; i < m*n; i++) vis.add(0);
        dfs(src, adj, arr);
        return arr;
    }
}

