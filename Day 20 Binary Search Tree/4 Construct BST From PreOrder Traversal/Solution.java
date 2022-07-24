public class Solution {
    
    static TreeNode<Integer> build(int[] preorder, int low, int high) {
        if(high < low) return null;
        TreeNode<Integer> root = new TreeNode<Integer>(0);
        root.data = preorder[low];
        int ind = high + 1;
        for(int i = low; i <= high; i++) {
            if(preorder[i] > preorder[low]) {
                ind = i;
                break;
            }
        }
        root.left = build(preorder, low + 1, ind - 1);
        root.right = build(preorder, ind, high);
        return root;
    }
 
	public static TreeNode<Integer> preOrderTree(int[] preorder) {
 		TreeNode<Integer> root = null;
        if(preorder.length == 0) return root;
        root = build(preorder, 0, preorder.length - 1);
        return root;
	}

}
