public class Solution {
    static boolean isSym(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> root2) {
        if(root == null && root2 == null) return true;
        if(root == null) return false;
        if(root2 == null) return false;
        if(!root.data.equals(root2.data)) return false;
        if(!isSym(root.left, root2.right)) return false;
        if(!isSym(root.right, root2.left)) return false;
        return true;
    }
    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        if(root == null) return true;
        return isSym(root.left, root.right);
    }
}
