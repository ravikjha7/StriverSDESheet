public class Solution {

    public  static int findCeil(TreeNode<Integer> root, int X) {

        if(root == null) return -1;
        // if(root.data == X) return root.data;

        if(root.data >= X) {
            int ans = findCeil(root.left, X);
            if(ans != -1)
            return Math.min(root.data, ans);
            else return root.data;
        }
        if(root.data < X) return findCeil(root.right, X);
        return -1;

    }
}
