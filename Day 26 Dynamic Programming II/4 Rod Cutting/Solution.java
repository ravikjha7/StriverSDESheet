import java.util.*;
public class Solution {
    
    static int maxCost(int i, int n, int price[], int [][]dp) {
        if(i < 0) return 0;
        if(dp[i][n] != -1) return dp[i][n];
        int nottake = maxCost(i - 1, n, price, dp);
        int take = (int)-1e8;
        if(n - (i + 1) >= 0) take = price[i] + maxCost(i, n - (i + 1), price, dp);
        return dp[i][n] = Math.max(nottake, take);
    }
    
	public static int cutRod(int price[], int n) {
        
        int []dp = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            dp[i] = i*price[0];
        }
        
        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= n; j++) {
                int take = 0;
                if(j - (i + 1) >= 0) take = price[i] + dp[j - (i + 1)];
                dp[j] = Math.max(take,dp[j]);
            }
        }
		return dp[n];
	}
}
