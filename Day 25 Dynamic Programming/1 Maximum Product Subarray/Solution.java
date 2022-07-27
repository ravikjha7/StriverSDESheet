import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> nums, int n) {
        int ans = nums.get(0);
        int maxm = nums.get(0);
        int minm = nums.get(0);
        for(int i = 1; i < n; i++) {
            int temp = maxm;
            maxm = Math.max(maxm*nums.get(i), minm*nums.get(i));
            maxm = Math.max(maxm, nums.get(i));
            minm = Math.min(minm*nums.get(i), temp*nums.get(i));
            minm = Math.min(minm, nums.get(i));
            ans = Math.max(ans, maxm);
        }
        return ans;
	}
}
