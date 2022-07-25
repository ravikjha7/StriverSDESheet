import java.util.*;

public class Solution {

    static class BSTIterator{
        static ArrayList<Integer> arr;
        static int i = 0;
        static void inOrder(TreeNode<Integer> root, ArrayList<Integer> arr) {
            if(root == null) return;
            inOrder(root.left, arr);
            arr.add(root.data);
            inOrder(root.right, arr);
        }
        BSTIterator(TreeNode<Integer> root){
            arr = new ArrayList<>();
            i = 0;
            inOrder(root, arr);
        }

        int next(){
            return arr.get(i++);
        }

        boolean hasNext(){
            if(i >= arr.size()) return false;
            return true;
        }
    }
}
