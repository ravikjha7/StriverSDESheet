import java.util.*;

public class Solution {
    public static boolean areAnagram(String s, String t){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(hm.get(s.charAt(i)) != null) hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            else hm.put(s.charAt(i), 1);
        }
        for(int i = 0; i < t.length(); i++) {
            if(hm.get(t.charAt(i)) != null) 
            {
                hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);
                int c = hm.get(t.charAt(i));
                if(c == 0) hm.remove(t.charAt(i));
            }
            else return false;
        }
        if(hm.size() == 0) return true;
        return false;
    }
}
