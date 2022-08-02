import java.util.*;

public class Solution {
    
    static void helper(int i, int n, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr) {
        if(i == n) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr.get(i));
        helper(i + 1, n, arr, ans, curr);
        curr.remove(curr.size() - 1);
        helper(i + 1, n, arr, ans, curr);
    }
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        int n = arr.size();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        helper(0, n, arr, ans, curr);
        return ans;
	}
}

