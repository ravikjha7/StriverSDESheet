import java.util.*;
public class Solution {
    public static int atoi(String s) {
        if(s.length() == 0) return 0;

        int i = 0;
        while(i < s.length() && s.charAt(i) == ' ') i++;
        
        if(i == s.length()) return 0;
        
        int sign = 1;
        if(s.charAt(i) == '-') sign = -1;
        
        if(s.charAt(i) == '+' || s.charAt(i) == '-') i++;
        
        long ans = 0;
        
        for(; i < s.length(); i++) {
            
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            ans = ((ans * 10) + (s.charAt(i) - '0'));
            
            if(sign == -1) {
                if(ans * -1 < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else {
                if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
            }
        }
        
        return (int)(ans * sign);
    }
}
