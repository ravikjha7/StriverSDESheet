import java.util.*;

public class Solution 
{
    static TreeNode<Integer> build(ArrayList<Integer>  preorder, int preS, int preE, ArrayList<Integer>  inorder, int inS, int inE, HashMap<Integer, Integer> hm) {
        if(preS > preE || inS > inE) return null;
        
        int ind = hm.get(preorder.get(preS));
        
        int nums = ind - inS;
        
        TreeNode<Integer> root = new TreeNode<Integer>(preorder.get(preS));
        root.left = build(preorder, preS + 1, preS + nums , inorder, inS, ind - 1, hm);
        root.right = build(preorder, preS + nums + 1, preE, inorder, ind + 1, inE, hm);
        
        return root;
        
    }
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < inorder.size(); i++) {
            hm.put(inorder.get(i), i);
        }
        TreeNode<Integer> root = build(preorder, 0, preorder.size() - 1, inorder, 0, inorder.size() - 1, hm);
        return root;
    }
}
