import java.util.*;

public class Solution 
{
    public static String serializeTree(TreeNode<Integer> root)
    {
        StringBuilder s = new StringBuilder("");
        if(root == null) return "";
        
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            TreeNode<Integer> t = q.poll();
            if(t == null) {
                s.append("#,");
                continue;
            }
                String a = Integer.toString(t.data);
                s.append(a);
                s.append(",");
                q.add(t.left);
                q.add(t.right);
        }
        
        return s.toString();
    }
    
    public static TreeNode<Integer> deserializeTree(String data)
    {
        if(data.length() == 0) return null;
        Queue<TreeNode<Integer>> q = new ArrayDeque<>();
        String[] values = data.split(",");
        TreeNode<Integer> root = new TreeNode<Integer>(Integer.parseInt(values[0]));
        q.add(root);
        
        for(int i = 1; i < values.length; i++) {
            TreeNode<Integer> t = q.poll();
            if(!values[i].equals("#")) {
                TreeNode left = new TreeNode<Integer>(Integer.parseInt(values[i]));
                t.left = left;
                q.add(left);
            }
            if(!values[++i].equals("#")) {
                TreeNode<Integer> right = new TreeNode<Integer>(Integer.parseInt(values[i]));
                t.right = right;
                q.add(right);
            }
        }
        return root;
    }
}
