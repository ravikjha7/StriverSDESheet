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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
        Stack<TreeNode> st = new Stack<>();
        
        TreeNode t = root;
        
        while(t != null || !st.isEmpty()) {
            
            if(t != null) {
                
                st.push(t);
                
                t = t.left;
            
            } else {
                
                t = st.pop();
                
                ans.add(t.val);
                
                t = t.right;
            }
            
        }
        
    }
}
