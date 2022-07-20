import java.util.*;

class Pair {
    public TreeNode f;
    public int s;
    public Pair(TreeNode f1, int s1) {
        f = f1;
        s = s1;
    }
}

public class Solution 
{
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Deque<Pair> dq = new ArrayDeque<>();
        if(root == null) return ans;
        
        Pair p = new Pair(root, 0);
        dq.addFirst(p);
        
        TreeMap<Integer, ArrayList<Integer>> hm = new TreeMap<>();
        
        while(!dq.isEmpty()) {
            TreeNode p1 = dq.peekFirst().f;
            int l = dq.pollFirst().s;
            
            ArrayList<Integer> lt;
            if(hm.containsKey(l)) {
                lt = hm.get(l);
            } else lt = new ArrayList<>();
            
            lt.add((Integer)p1.data);
            hm.put(l, lt);
            
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
            List<Integer> e = ((List<Integer>)mapElement.getValue());
            for(int i : e) {
                ans.add(i);
            }
        }
        return ans;
    }
}
