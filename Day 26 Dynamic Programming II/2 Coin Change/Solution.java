
public class Solution {
    
    static long coinchange(int coins[], int amount, int n, long [][]dp) {
        if(amount == 0) return 1;
        if(n < 0 || amount < 0) return 0;
        
        if(dp[n][amount] != -1) return dp[n][amount];
        
        long take = coinchange(coins, amount - coins[n], n, dp);
        long nottake = coinchange(coins, amount, n - 1, dp);
        return dp[n][amount] = take + nottake;
    }

	public static long countWaysToMakeChange(int denominations[], int value){
        int n = denominations.length;
        long [][]dp = new long[n][value + 1];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= value; j++) dp[i][j] = -1;
        }
        
        long ans = coinchange(denominations, value, n - 1, dp);
        return ans;
	}
	
}
