public class Solution {
    public static boolean IsValid(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> l, BinaryTreeNode<Integer> r) {
        if (root == null) return true;
        
        if ((l != null && root.data < l.data) || (r != null && root.data > r.data)) return false;
        
        return IsValid(root.left, l, root) && IsValid(root.right, root, r);
    }
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        return IsValid(root, null, null);
    }
}
