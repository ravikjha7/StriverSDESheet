public class Solution {
    static BinaryTreeNode<Integer> head;
    static BinaryTreeNode<Integer> p;
    static void inOrder(BinaryTreeNode<Integer> root) {
        if(root == null) return;
        inOrder(root.left);
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(root.data);
        if(head == null) 
        {
            head = temp;
            p = head;
        }
        else 
        {
            p.right = temp;
            temp.left = p;
            p = p.right;
        }
        inOrder(root.right);
    }
	
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		head = null;
        p = null;
        inOrder(root);
        return head;
	}
	

}
