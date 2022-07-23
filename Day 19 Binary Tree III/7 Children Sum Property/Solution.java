public class Solution {
    public static void changeTree(BinaryTreeNode < Integer > root) {
        if(root == null) return;
        int curr = 0;
        
        if(root.left != null) curr += root.left.data;
        if(root.right != null) curr += root.right.data;
        
        if(curr < root.data) {
            if(root.left != null) root.left.data = root.data;
            else if(root.right != null) root.right.data = root.data;
        }
        
        changeTree(root.left);
        changeTree(root.right);
        
        int ans = 0;
        if(root.left != null) ans += root.left.data;
        if(root.right != null) ans += root.right.data;
        
        if(root.left != null || root.right != null) root.data = ans;
    }
}
