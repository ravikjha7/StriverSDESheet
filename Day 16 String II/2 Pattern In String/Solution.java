public class Solution {
    public static boolean findPattern(String pat, String str) {
         for(int i = 0; i <= str.length() - pat.length(); i++) {
             boolean flag = true;
             if(str.charAt(i) != pat.charAt(0) || str.charAt(i + pat.length() - 1) != pat.charAt(pat.length() - 1)) continue;
             for (int j = 0; j < pat.length(); j++) {
                if (str.charAt(i + j) != pat.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) return true ;
         }
        return false;
    }
}
