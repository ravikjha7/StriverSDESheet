import java.util.*;
public class Solution
{
    
    static void dfs(int i, int j, int [][]vis, int [][]arr, int color, int newColor) {
        vis[i][j] = 1;
        arr[i][j] = newColor;
        if(i != 0) {
            if(vis[i - 1][j] == 0) {
                if(arr[i - 1][j] == color) dfs(i - 1, j , vis, arr, color, newColor);
            }
        }
        if(j != 0) {
            if(vis[i][j - 1] == 0) {
                if(arr[i][j - 1] == color) dfs(i, j - 1, vis, arr, color, newColor);
            }
        }
        if(i != arr.length - 1) {
            if(vis[i + 1][j] == 0) {
                if(arr[i + 1][j] == color) dfs(i + 1, j , vis, arr, color, newColor);
            }
        }
        if(j != arr[0].length - 1) {
            if(vis[i][j + 1] == 0) {
                if(arr[i][j + 1] == color) dfs(i, j + 1, vis, arr, color, newColor);
            }
        }
    }
    
    public static int[][] floodFill(int[][] arr, int sr, int sc, int color)
    {
        int m = arr.length;
        int n = arr[0].length;
        
        int col = arr[sr][sc];
        
        int [][]vis = new int[m][n];
        
        dfs(sr, sc, vis, arr, col, color);
        
        return arr;
    }
}

