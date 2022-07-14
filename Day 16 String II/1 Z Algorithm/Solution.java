import java.util.*;
public class Solution {

	public static int zAlgorithm(String str, String pat, int n, int m) {
        int ans = 0;
        for(int i = 0; i <= n - m; i++) {
            boolean flag = true;
            for(int j = 0; j < m; j++) {
                if(str.charAt(i + j) != pat.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }

}
