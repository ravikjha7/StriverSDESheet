public class Solution {
    
    public static boolean identicalTrees(BinaryTreeNode<Integer> p, BinaryTreeNode<Integer> q) {
        if(p == null && q == null) return true;
        if(p == null) return false;
        if(q == null) return false;
        if(!p.data.equals(q.data)) return false;
        if(!identicalTrees(p.left, q.left)) return false;
        if(!identicalTrees(p.right, q.right)) return false;
        return true;      
    }

}
