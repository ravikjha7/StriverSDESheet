import java.util.*;

public class Solution {
    
    static void dfs(graphNode node, graphNode newNode, HashMap<graphNode, graphNode> hm) {
        hm.put(node, newNode);
        for(graphNode i : node.neighbours) {
            if(!hm.containsKey(i)) {
                graphNode temp = new graphNode(i.data);
                dfs(i, temp, hm);
            }
            newNode.neighbours.add(hm.get(i));
        }
    }
    
    public static graphNode cloneGraph(graphNode node) {
        if(node == null) return null;
        HashMap<graphNode, graphNode> hm = new HashMap<>();
        graphNode newNode = new graphNode(node.data);
        dfs(node, newNode, hm);
        return newNode;
    }
}
