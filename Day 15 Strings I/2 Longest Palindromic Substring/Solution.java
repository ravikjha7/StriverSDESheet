import java.util.*;

public class Solution {	
	public static String longestPalinSubstring(String s) {
    int n = s.length();
        
        int curr = 0, maxm = 0;
        String ans = "";
        
        for(int i = 0; i < n; i++) {

            int l = i - 1;
            while(l >= 0 && s.charAt(l) == s.charAt(i)) l--;
            
            int r = i + 1;
            while(r < n && s.charAt(r) == s.charAt(i)) r++;
            
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--; 
                r++;
            }
            
            curr = r - l - 1;
            
            if(curr > maxm) {
                
                maxm = curr;
                
                ans = s.substring(l + 1, r);
            }
        }
        return ans;
	}
}
