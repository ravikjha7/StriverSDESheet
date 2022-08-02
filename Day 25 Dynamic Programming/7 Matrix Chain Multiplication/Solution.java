
public class Solution {
    
    static int matrixmul(int i, int j, int []arr, int [][]dp) {
        if(i == j) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int minm = (int)1e9;
        for(int k = i; k < j; k++) {
            minm = Math.min(minm, arr[i - 1]*arr[k]*arr[j] + matrixmul(i, k, arr, dp) + matrixmul(k + 1, j, arr, dp));
        }
        return dp[i][j] = minm;
    }
    
	public static int matrixMultiplication(int[] arr , int n) {
		int [][]dp = new int[n][n];
        
        for(int i = n - 1; i > 0; i--) {
            for(int j = i + 1; j < n; j++) {
                int minm = (int)1e9;
                for(int k = i; k < j; k++) {
                    minm = Math.min(minm, arr[i - 1]*arr[j]*arr[k] + dp[i][k] + dp[k + 1][j]);
                }
                dp[i][j] = minm;
            }
        }
        
        return dp[1][n - 1];
        
	}
}
