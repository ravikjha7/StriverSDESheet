
public class Solution {
    static int mindistance(int i, int j, String word1, String word2, int [][]dp) {
        if(i < 0) return j + 1;
        if(j < 0) return i + 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = mindistance(i - 1, j - 1, word1, word2, dp);
        }
        
        int insert = 1 + mindistance(i, j - 1, word1, word2, dp);
        
        int remove = 1 + mindistance(i - 1, j, word1, word2, dp);
        
        int replace = 1 + mindistance(i - 1, j - 1, word1, word2, dp);
        
        return dp[i][j] = Math.min(insert, Math.min(remove, replace));
        
    }
    public static int editDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int [][]dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) dp[i][j] = -1;
        }
        
        return mindistance(m - 1, n - 1, word1, word2, dp);
    }
}
