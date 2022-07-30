import java.util.*;
public class Solution {
    
    public static int upperBound(ArrayList<Integer> nums, int x) {
        int low = 0;
        int high = nums.size();
        
        while(low < high) {
            int mid = low + (high - low)/2;
            if(nums.get(mid) < x) low = mid + 1;
            else high = mid;
        }
        
        return low;
    }
    
	public static int longestIncreasingSubsequence(int nums[]) {
		int n = nums.length;
        
        int []dp = new int[n];
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(nums[0]);
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            if(arr.get(arr.size() - 1) < nums[i]) {
                arr.add(nums[i]);
            }
            else {
                int pos = upperBound(arr, nums[i]);
                // if(pos < arr.size() && pos >= 0) 
                // System.out.println(pos);
                arr.set(pos, nums[i]);
            }
        }
        return arr.size();
        
	}

}
