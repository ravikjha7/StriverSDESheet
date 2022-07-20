import java.util.*;

public class Solution {
    public static void treeTraversal(BinaryTreeNode root, List<List<Integer>> lt) {
        if(root == null) return;
        lt.get(1).add((Integer)root.data);
        treeTraversal(root.left, lt);
        lt.get(0).add((Integer)root.data);
        treeTraversal(root.right, lt);
        lt.get(2).add((Integer)root.data);
    }
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        List<List<Integer>> lt = new ArrayList<>();
        for(int i = 0; i < 3; i++) lt.add(new ArrayList<>());
        treeTraversal(root, lt);
        return lt;
    }
}
