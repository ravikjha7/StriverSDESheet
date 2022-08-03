import java.util.*;

class Node {
    int height;
    int left;
    int right;
    Node(int a, int b, int c) {
        height = a;
        left = b;
        right = c;
    }
}

public class Solution {
	public static int heightOfTheTree(int[] inorder, int[] levelOrder, int n){
		Queue<Node> q = new ArrayDeque<>();
        q.offer(new Node(0, 0, n - 1));
        int []pos = new int[n + 1];
        for(int i = 0; i < n; i++) pos[inorder[i]] = i;
        
        int maxm = 0;
        for(int i = 0; i < n; i++) {
            int curr = levelOrder[i];
            
            Node currNode = q.poll();
            
            int currPos = pos[curr];
            
            if(currPos > currNode.left) {
                q.offer(new Node(currNode.height + 1, currNode.left, currPos - 1));
                maxm = Math.max(currNode.height + 1, maxm);
            }
            
            if(currPos < currNode.right) {
                q.offer(new Node(currNode.height + 1, currPos + 1, currNode.right));
                maxm = Math.max(currNode.height + 1, maxm);
            }

        }
                    
           return maxm;
	}
}
