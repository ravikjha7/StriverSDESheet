class Solution {
    static void postOrder(TreeNode root, List<Integer> ans) {
        if(root == null) return;
        
         postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }
}
