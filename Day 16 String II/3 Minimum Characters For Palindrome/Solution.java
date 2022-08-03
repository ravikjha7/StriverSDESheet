import java.util.*;

public class Solution {

    public static int minCharsforPalindrome(String s) {
        StringBuilder s2 = new StringBuilder(s);
        String t = s2.reverse().toString();
        int i = 0, j = 0;
        
        while(i < t.length()) {
            int temp = i;
            while(temp < t.length() && s.charAt(j) == t.charAt(temp)) {
                temp++;
                j++;
            }
            if(temp == t.length()) return i;
            j = 0;
            i++;
        }
        return -1;
    }

}
