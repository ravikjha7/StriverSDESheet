/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int[] solve(TreeNode A, int B) {
        
        HashMap<Integer, Integer> p = new HashMap<>() ;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if (A != null) q.add(A);
        
        while(!q.isEmpty()) {
            
            TreeNode curr = q.poll();
            
            if (curr.left != null) {
                p.put(curr.left.val, curr.val);
                q.add(curr.left);
            }
            if (curr.right != null) {
                p.put(curr.right.val, curr.val);
                q.add(curr.right);
            }
        }
        
        LinkedList<Integer> arr = new LinkedList<>();
        
        while(p.containsKey(B)) {
            
            arr.addFirst(B);
            
            B = p.get(B);
        
        }
        
        arr.addFirst(B) ;
        
        int[] ans = new int[arr.size()];
        
        int i = 0;
        
        for(int x : arr) ans[i++] = x;
        
        return ans;
    }
}
