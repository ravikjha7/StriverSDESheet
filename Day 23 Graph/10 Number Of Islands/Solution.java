public class Solution 
{
    static void dfs(int i, int j, int [][]vis, int [][]arr) {
        vis[i][j] = 1;
        if(i != 0) {
            if(vis[i - 1][j] == 0) {
                if(arr[i - 1][j] == 1) dfs(i - 1, j , vis, arr);
            }
        }
        if(j != 0) {
            if(vis[i][j - 1] == 0) {
                if(arr[i][j - 1] == 1) dfs(i, j - 1, vis, arr);
            }
        }
        if(i != arr.length - 1) {
            if(vis[i + 1][j] == 0) {
                if(arr[i + 1][j] == 1) dfs(i + 1, j , vis, arr);
            }
        }
        if(j != arr[0].length - 1) {
            if(vis[i][j + 1] == 0) {
                if(arr[i][j + 1] == 1) dfs(i, j + 1, vis, arr);
            }
        }
        if(i != 0 && j != 0) {
            if(vis[i - 1][j - 1] == 0) {
                if(arr[i - 1][j - 1] == 1) dfs(i - 1, j - 1, vis, arr);
            }
        }
        
        if(i != 0 && j != arr[0].length - 1) {
            if(vis[i - 1][j + 1] == 0) {
                if(arr[i - 1][j + 1] == 1) dfs(i - 1, j + 1, vis, arr);
            }
        }
        
        if(i != arr.length - 1 && j != 0) {
            if(vis[i + 1][j - 1] == 0) {
                if(arr[i + 1][j - 1] == 1) dfs(i + 1, j - 1, vis, arr);
            }
        }
        
        if(i != arr.length - 1 && j != arr[0].length - 1) {
            if(vis[i + 1][j + 1] == 0) {
                if(arr[i + 1][j + 1] == 1) dfs(i + 1, j + 1, vis, arr);
            }
        }
        
    }
    
    public static int getTotalIslands(int[][] grid) 
	{
        int m = grid.length;
        int n = grid[0].length;
        
        int [][]vis = new int[m][n];
        
        int ans = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(vis[i][j] == 0 && grid[i][j] == 1) 
                {
                    ans++;
                    dfs(i, j, vis, grid);
                }
            }
        }
        
        return ans;
    }
}
