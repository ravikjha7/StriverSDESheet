import java.util.ArrayList;

public class Solution {
    static int count = 0;
    static int ans = -1;
    static void InOrder(TreeNode<Integer> root, int k) {
        if(root == null) return;
        InOrder(root.right, k);
        count++;
        if(count == k) ans = root.data;
        InOrder(root.left, k);
    }
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		count = 0;
        ans = -1;
        InOrder(root, k);
        return ans;
	}
}
