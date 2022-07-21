import java.util.*;

public class Solution {
	public static int getMaxWidth(TreeNode root) {
		Queue<TreeNode> q = new ArrayDeque<>();
        if(root == null) return 0;
        q.add(root);
        int maxm = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            maxm = Math.max(maxm, size);
            while(size-- > 0) {
                TreeNode curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return maxm;
	}
}
