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
    static void postOrder(TreeNode root, List<Integer> ans) {
        if(root == null) return;
        
         postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        
        Stack<TreeNode> st = new Stack<>();
        
        if(root == null) return ans;
        
        st.push(root);
        
        while(!st.isEmpty())
        {
            TreeNode curr = st.pop();
            ans.addFirst(curr.val);
            
            if(curr.left != null) st.push(curr.left) ;
            
            if(curr.right != null) st.push(curr.right) ;
        }
        
        return ans;
    }
}
