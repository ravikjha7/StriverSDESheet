public class Solution 
{
    static String justSay(String s)
    {
        
        int i = 0;
        String ans = "";
        int c = 1;
        while(i < s.length())
        {
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                c++;
                i++;
            }
            else {
                String ch = Integer.toString(c);

                ans = ans + ch + s.charAt(i);
                i++;
                c = 1;
            }
        }
        return ans;
    }
    public static String writeAsYouSpeak(int n) 
    {
        String ans;
        ans = justSay("1");
        
        if(n == 1) return "1";
        
        for(int i = 1; i < n - 1; i++) ans = justSay(ans);
        
        return ans;  
    }
}
