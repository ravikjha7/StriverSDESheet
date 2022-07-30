import java.util.ArrayList;

public class Solution {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        int []dp = new int[n];
        
        dp[0] = rack.get(0);
        
        for(int i = 1; i < n; i++) {
            int maxm = 0;
            for(int j = 0; j < i; j++) {
                if(rack.get(j) < rack.get(i)) maxm = Math.max(dp[j], maxm);
            }
            dp[i] = maxm + rack.get(i);
        }
        int maxm = 0;
        for(int i = 0; i < n; i++) maxm = Math.max(maxm, dp[i]);
        
        return maxm;
        
    }
}
