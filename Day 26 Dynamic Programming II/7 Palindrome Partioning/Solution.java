public class Solution {
    
    static int palindrome(int i, int j, String str, int[][] dp) {
        int low = i;
        int high = j;
        
        boolean flag = true;        
        while(high >= low) {
            if(str.charAt(high) != str.charAt(low)) {
                flag = false;
                break;
            }
            high--;
            low++;
        }
        if(flag) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int minm = (int)1e9;
        for(int k = i; k < j; k++) {
            // boolean flag = true;
            int l = i;
            int h = k;
            boolean f = true;
            while(l <= h) {
                if(str.charAt(l) != str.charAt(h)) {
                    f = false;
                    break;
                }
                l++;
                h--;
            }
            if(!f) continue;
            int s = palindrome(k + 1, j, str, dp);
            minm = Math.min(minm, 1 + s);
        }
        
        return dp[i][j] = minm;
        
    }

	public static int palindromePartitioning(String str) {
	    int n = str.length();
        
        int [][]dp = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) dp[i][j] = -1;
        }
        
        return palindrome(0, n - 1, str, dp);
        
	}
}
