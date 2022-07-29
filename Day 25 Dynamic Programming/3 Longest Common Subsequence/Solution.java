
public class Solution {

	public static int lcs(String s1, String s2) {
		int n = s1.length();
        int m = s2.length();
        
        int []dp = new int[m + 1];
        
        for(int i = 1; i <= n; i++) {
            int []curr = new int[m + 1];
            for(int j = 1; j <= m; j++) {
                
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) curr[j] = 1 + dp[j - 1];
                else curr[j] = Math.max(curr[j - 1], dp[j]);
            }
            dp = curr;
        }
        
        return dp[m];
    }

}
