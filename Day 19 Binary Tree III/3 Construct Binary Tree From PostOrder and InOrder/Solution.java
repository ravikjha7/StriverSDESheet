import java.util.*;
public class Solution 
{
    public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postorder, int[] inorder) 
    {
       return helper(inorder, postorder, postorder.length - 1, 0, inorder.length - 1);   
    }
    
    static TreeNode helper(int[] inorder, int[] postorder, int posS, int is, int ie){
      if(posS >= postorder.length || is > ie) return null;
        
      TreeNode node = new TreeNode(postorder[posS]);
        
      int ind = 0;
        
      for(int i = 0; i < inorder.length; i++) {
        if(inorder[i] == postorder[posS]) ind = i;  
      }
        
      node.left = helper(inorder, postorder, posS - 1 - ie + ind, is, ind - 1);
      node.right = helper(inorder, postorder, posS - 1 , ind + 1, ie);
        
      return node;
    }
    
}
