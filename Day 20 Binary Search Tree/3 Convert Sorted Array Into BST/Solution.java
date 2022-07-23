import java.util.*;

public class Solution {
    static TreeNode<Integer> build(ArrayList<Integer> nums, int low, int high) {
        if(low > high) return null;
        TreeNode<Integer> root = new TreeNode<Integer>(nums.get((high + low)/2));
        if(root == null) return root;
        root.left = build(nums, low, ((high + low)/2 - 1));
        root.right = build(nums, ((high + low)/2)+1, high);
        return root;
    }
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        if(n == 0) return null;
        TreeNode<Integer> root = build(arr, 0, n - 1);
        return root;
    }
}
