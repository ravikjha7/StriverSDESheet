public class Solution {
	public static Boolean searchInBST(BinaryTreeNode<Integer> root, int val) {
		if(root == null) return false;
        if(root.data == val) return true;
        if(root.data < val) return searchInBST(root.right, val);
        if(root.data > val) return searchInBST(root.left, val);
        return false;
	}
}
