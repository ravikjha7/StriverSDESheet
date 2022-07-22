public class Solution {
    static long maxm = (long)-1;
    static long maxSum(TreeNode root) {
        
        if(root == null) return -1;
        
        long l = maxSum(root.left);
        long r = maxSum(root.right);
        
        if(l != -1 && r != -1) maxm = Math.max(l + r + root.data, maxm);
        
        long ans = Math.max(l, r) ;
        
        if (ans > 0) return ans + root.data;
       
        return root.data;
    }
	public static long findMaxSumPath(TreeNode root) {
        
        maxm = (long)-1;
        
		maxSum(root);
        
        return maxm;
	}
}
