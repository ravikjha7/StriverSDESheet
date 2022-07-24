import java.util.*;

public class Solution {
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	Queue<BinaryTreeNode<Integer>> q = new ArrayDeque<>();
        if(root == null) return;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<BinaryTreeNode<Integer>> lt = new ArrayList<>();
            while(size-- > 0) {
                BinaryTreeNode<Integer> temp = q.poll();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                lt.add(temp);
            }
            for(int i = 0; i < lt.size() - 1; i++) {
                lt.get(i).next = lt.get(i + 1);
            }
            lt.get(lt.size() - 1).next = null;
        }
	}
}
