class Solution {
    static void inOrder(TreeNode root, List<Integer> ans) {
        if(root == null) return;
         inOrder(root.left, ans);
        ans.add(root.val);
       
        inOrder(root.right, ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        return ans;
    }
}
