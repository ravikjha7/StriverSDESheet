  public class Solution {
	public static int findCelebrity(int n) {
        
        int ans = 0 ;
        
        for (int i = 1; i < n; i++) {
            
            if (!Runner.knows(i, ans)) ans = i;
        }
        
        int a = 0, b = 0;
        
        for (int i = 0 ; i < n; i++)
        {
            if (Runner.knows(i, ans)) a++;
            
            if (Runner.knows(ans, i)) b++;
        }
        
        if (a == n - 1 && b == 0) return ans;
        
        return -1;
    }
}
