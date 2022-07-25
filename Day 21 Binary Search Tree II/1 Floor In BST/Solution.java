public class Solution {
    // int maxm = 0;
    public static int floorInBST(TreeNode<Integer> root, int X) {
        if(root == null) return 0;
        if(root.data == X) return root.data;
        if(root.data > X) return floorInBST(root.left, X);
        if(root.data < X) return Math.max(root.data, floorInBST(root.right, X));
        return -1;
    }
}
