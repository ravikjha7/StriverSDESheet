import java.util.*;

class Node {
    int size;
    int max;
    int min;
    
    Node(int s, int m, int mm) {
        size = s;
        max = m;
        min = mm;
    }
}


public class Solution {
    
    static int ans = 0;
    
    public static Node postOrder(TreeNode<Integer> root) {
        
        if(root == null) return (new Node(0, (int)-1e8, (int)1e8));
        
        Node left = postOrder(root.left);
        Node right = postOrder(root.right);
        
        if(left.max >= (int)root.data) return (new Node((int)-1e8, (int)-1e8, (int)1e8));
        
        if(right.min <= (int)root.data) return (new Node((int)-1e8, (int)-1e8, (int)1e8));
        
        ans = Math.max(ans, left.size + right.size + 1);
        
        return (new Node(left.size + right.size + 1, Math.max(right.max, (int)root.data), Math.min(left.min, (int)root.data)));
        
    }
    
	public static int largestBST(TreeNode<Integer> root) {
		
        ans = 0;
        
        postOrder(root);
        
        return ans;
        
	}
}
