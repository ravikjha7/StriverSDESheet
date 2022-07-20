class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
        TreeNode p = root;
        
        if(root == null) return ans;
        
        while(p != null) {
            
            if(p.left == null) {
                
                ans.add(p.val);
                
                p = p.right;
                
            } else {
                
                TreeNode prev = p.left;
                
                while(prev.right != null && prev.right != p) prev = prev.right;
                
                if(prev.right == null) {
                    
                    prev.right = p;
                    
                    p = p.left;
                
                } else {
                    
                    prev.right = null;
                    
                    ans.add(p.val);
                    
                    p = p.right;
                    
                }
                
            }
            
            
        }
        return ans;
}
}
