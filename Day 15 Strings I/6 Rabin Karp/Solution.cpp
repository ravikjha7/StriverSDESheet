import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> stringMatch(String str, String pat) {
    
        ArrayList<Integer> ans = new ArrayList<>() ;
        
        int n = str.length();
        int m = pat.length();
        
        int hashS = 0;
        int hashP = 0;
        
        for(int i = 0; i < m; i++) {
            hashS += (str.charAt(i) - 'A' +  1) * Math.pow(5, i);
            hashP += (pat.charAt(i) - 'A' + 1) * Math.pow(5, i);
        }
        
        if(hashP == hashS) {
            if(check(str, pat, 0)) ans.add(0);
        }
        
        int low = 0, high = m;
        
        while(high < n)
        {
            hashS -= (str.charAt(low) - 'A' + 1);
            hashS /= 5;
            hashS  += (str.charAt(high) - 'A'+1) * Math.pow(5, m-1);
                     
            if(hashS == hashP) {
                if(check(str, pat, low+1)) ans.add(low+1);
            }
            low++; 
            high++;
        }
        return ans;
    }
    
   static boolean check(String s, String s1, int ind) {
       for(int i = 0; i < s1.length(); i++) {
           if(s.charAt(ind + i) != s1.charAt(i)) return false;
       } 
       return true;
   } 
}
