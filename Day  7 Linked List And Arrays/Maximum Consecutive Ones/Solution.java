import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		int s = 0;
        int e = 0;
        int ans = 0;
        
        while(e < n) {
            if(arr.get(e) == 0) k--;
            if(k < 0) {
                while(arr.get(s) != 0) s++;
                s++;
                k++;
            } else {
                ans = Math.max(ans, e - s + 1);
            }
            e++;
        }
        return ans;
	}
}
