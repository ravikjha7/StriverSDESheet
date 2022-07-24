import java.util.*;

public class Solution {
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
        BinaryTreeNode<Integer> curr = root;
        int pre = -1, succ = -1;
        if(root == null) {
            ans.add(pre);
            ans.add(succ);
            return ans;
        }
        while(curr.data != key) {
            if(curr.data < key) {
                pre = curr.data;
                curr = curr.right;
            } else {
                succ = curr.data;
                curr = curr.left;
            }
        }
        BinaryTreeNode<Integer> prev = curr.left;
        while(prev != null) {
            pre = prev.data;
            prev = prev.right;
        }
        BinaryTreeNode<Integer> suc = curr.right;
        while(suc != null) {
            succ = suc.data;
            suc = suc.left;
        }
        ans.add(pre);
        ans.add(succ);
        return ans;
	}
}
