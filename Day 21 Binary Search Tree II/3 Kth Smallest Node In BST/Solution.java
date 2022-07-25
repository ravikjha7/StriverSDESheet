public class Solution 
{
    static int count = 0;
    static int ans = 0;
    static void InOrder(TreeNode<Integer> root, int k) {
        if(root == null) return;
        InOrder(root.left, k);
        count++;
        if(count == k) ans = root.data;
        InOrder(root.right, k);
    }
	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		count = 0;
        ans = 0;
        InOrder(root, k);
        return ans;
	}

}
