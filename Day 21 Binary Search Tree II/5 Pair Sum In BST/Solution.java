import java.util.*;
public class Solution {
    static void inOrder(BinaryTreeNode root, ArrayList<Integer> arr) {
        if(root == null) return;
        
        inOrder(root.left, arr);
        
        arr.add(root.data);
        
        inOrder(root.right, arr);
    }
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		ArrayList<Integer> arr = new ArrayList<>();
        
        inOrder(root, arr);
        
        int low = 0, high = arr.size() - 1;
        while(low < high) {
            if(arr.get(low) + arr.get(high) == k) return true;
            if(arr.get(low) + arr.get(high) > k) high--;
            else low++;
        }
        return false;
	}
}

