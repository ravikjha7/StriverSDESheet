
import java.util.*;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
      ArrayList<Integer> lt = new ArrayList<>();
    Queue<BinaryTreeNode> q = new ArrayDeque<>();
        if(root == null) return lt;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                BinaryTreeNode p = q.poll();
                lt.add(p.val);
                if(p.left != null) q.add(p.left);
                if(p.right != null) q.add(p.right);
            }
        }
        return lt;
  }

}
