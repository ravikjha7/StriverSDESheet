import java.util.*;

public class Solution {
    static int maxprofit(int n, int w, ArrayList<Integer> values, ArrayList<Integer> weights, int [][]dp) {
        if(n < 0) return 0;
        if(w == 0) return 0;
        
        if(dp[n][w] != -1) return dp[n][w];
        
        int take = 0;
        int nottake = maxprofit(n - 1, w, values, weights, dp);
        if(w - weights.get(n) >= 0) take = values.get(n) + maxprofit(n - 1, w - weights.get(n), values, weights, dp);
        
        return dp[n][w] = Math.max(take, nottake);
        
    }
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		int dp[][] = new int[n][w + 1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= w; j++) {
                dp[i][j] = -1;
            }
        }
        return maxprofit(n - 1, w, values, weights, dp);
	}
}
