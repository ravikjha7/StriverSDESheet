import java.util.*;

public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		List<Integer> ans = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> q = new ArrayDeque<>();
        if(root == null) return ans;
        
        q.add(root);
        int count = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> lt = new ArrayList<>();
            while(size-- > 0) {
                BinaryTreeNode<Integer> p = q.poll();
                if(p.left != null) q.add(p.left);
                if(p.right != null) q.add(p.right);
                lt.add(p.data);
            }
            if(count % 2 == 1) Collections.reverse(lt);
            for(int i : lt) ans.add(i);
            count++;
        }
        
        return ans;

	}
}
