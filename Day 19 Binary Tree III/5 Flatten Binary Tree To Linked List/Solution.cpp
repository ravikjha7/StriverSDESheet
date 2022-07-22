public class Solution 
{
    static TreeNode<Integer> prev = null;
    public static void flatten(TreeNode<Integer> root) {
        if (root == null) return;
   
        flatten(root.right);
        flatten(root.left);
        
        root.right = prev;
        root.left = null;
        
        prev = root;
    }
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        prev = null;
        flatten(root);
        return root;
    }
}
