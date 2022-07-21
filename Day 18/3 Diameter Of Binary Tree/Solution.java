public class Solution {
    static int ans = 0;
    
    static int diameter(TreeNode<Integer> root) {
        if(root == null) return 0;
        
        int l = diameter(root.left);
        int r = diameter(root.right);
        ans = Math.max(ans, l + r);
        return Math.max(l, r) + 1;
    }
    
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		if(root == null) return 0;
        ans = 0;
        diameter(root);
        return ans;
	}
}
