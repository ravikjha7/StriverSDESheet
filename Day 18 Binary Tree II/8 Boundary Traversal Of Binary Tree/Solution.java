import java.util.*;

public class Solution {
    
    static void addLeft(TreeNode root, ArrayList<Integer> ans) {
        if(root == null) return;
        if(root.left != null || root.right != null) ans.add(root.data);
        if(root.left != null) addLeft(root.left, ans);
        else addLeft(root.right, ans);
    }
    
    static void addLeaves(TreeNode root, ArrayList<Integer> ans) {
        if(root == null) return;
        
        addLeaves(root.left, ans);
        if(root.left == null && root.right == null) ans.add(root.data);
        addLeaves(root.right, ans);
    }
    
    static void addRight(TreeNode root, ArrayList<Integer> ans) {
        if(root == null) return;
        
        if(root.right != null || root.left != null) ans.add(root.data);
        if(root.right != null) addRight(root.right, ans);
        else addRight(root.left, ans);
        
    }
    
	public static ArrayList<Integer> traverseBoundary(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        ans.add(root.data);
        if(root.left == null && root.right == null) return ans;
        ArrayList<Integer> curr = new ArrayList<>();
        addLeft(root.left, ans);
        addLeaves(root, ans);
        addRight(root.right, curr);
        Collections.reverse(curr);
        for(int i = 0; i < curr.size(); i++) ans.add(curr.get(i));
        
        return ans;
	}
}
