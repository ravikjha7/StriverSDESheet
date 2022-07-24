import java.util.*;
public class Solution 
{
	public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        if(root == null || root == p || root == q) return root;
        TreeNode<Integer> l = LCAinaBST(root.left, p, q);
        TreeNode<Integer> r = LCAinaBST(root.right, p, q);
        if(l == null) return r;
        else if(r == null) return l;
        else return root;
	}
}
