/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void preOrder(TreeNode root, List<Integer> ans) {
        if(root == null) return;
        ans.add(root.val);
         preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        
        Stack<TreeNode> st = new Stack<>();
        
        TreeNode t = root;
        
        while(t != null || !st.isEmpty()) {
            
            if(t != null) {
                
                ans.add(t.val);
                
                st.push(t);
                
                t = t.left;
            
            } else {
                
                t = st.pop();
                
                t = t.right;
            }
            
        }
        
        return ans;
    }
}
