import java.util.*;

class Pair {
    public BinaryTreeNode f;
    public int s;
    public Pair(BinaryTreeNode f1, int s1) {
        f = f1;
        s = s1;
    }
}

public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
        
        Deque<Pair> dq = new ArrayDeque<>();
        if(root == null) return ans;
        
        Pair p = new Pair(root, 0);
        dq.addFirst(p);
        
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        
        while(!dq.isEmpty()) {
            BinaryTreeNode p1 = dq.peekFirst().f;
            int l = dq.pollFirst().s;
            
            if(!hm.containsKey(l)) hm.put(l, p1.val);
            
            if(p1.left != null) 
            {
                Pair p2 = new Pair(p1.left, l - 1);
                dq.addLast(p2);
            }
            
            if(p1.right != null) 
            {
                Pair p3 = new Pair(p1.right, l + 1);
                dq.addLast(p3);
            }
        }
        
        Iterator hmIterator = hm.entrySet().iterator();
        
        while (hmIterator.hasNext()) {
 
            Map.Entry mapElement
                = (Map.Entry)hmIterator.next();
            int e = ((int)mapElement.getValue());
            ans.add(e);
        }
        return ans;
	}
}
