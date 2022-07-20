import java.util.*;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        ArrayDeque<TreeNode> dq = new ArrayDeque<>();
        
        dq.addLast(root);
        
        while(!dq.isEmpty()) {
            int size = dq.size();
            
            TreeNode tt = dq.peekFirst();
            
            ans.add((Integer)tt.data);
            
            while(size-- > 0) {
                TreeNode t = dq.pollFirst();
                if(t.left != null) dq.addLast(t.left);
                if(t.right != null) dq.addLast(t.right);
            }
        }
        
        return ans;
    }
}
