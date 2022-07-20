class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
        TreeNode p = root;
        
        if(root == null) return ans;
        
        while(p != null) {
            
            if(p.left == null) {
                
                ans.add(p.val);
                
                p = p.right;
                
            } else {
                
                TreeNode prev = p.left;
                
                // ans.add(p.val);
                
                while(prev.right != null && prev.right != p) prev = prev.right;
                
                if(prev.right == null) {
                    
                    prev.right = p;
                    
                    ans.add(p.val);
                    
                    p = p.left;
                
                } else {
                    
                    prev.right = null;
                    
                    p = p.right;
                    
                }
                
            }
            
            
        }
        return ans;
    }
}
