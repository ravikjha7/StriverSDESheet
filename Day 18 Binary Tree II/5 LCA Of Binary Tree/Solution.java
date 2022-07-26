public class Solution 
{
    public static int lowestCommonAncestor(TreeNode<Integer> root, int p, int q) 
    {
        if(root == null) return -1;
        if(root.data == p || root.data == q) return root.data;
        int l = lowestCommonAncestor(root.left, p, q);
        int r = lowestCommonAncestor(root.right, p, q);
        if(l == -1) return r;
        else if(r == -1) return l;
        else return root.data;
    }
}
