import java.util.*;

public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
    
    // Min Heap Waala
    PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
        
        int[] ans = new int[n];
        
    for(int i = 0; i < n; i++) {
        int num = arr[i];
        
        if(pq.size() == 0 || num < pq.peek()) pq.add(num);
        else pq2.add(num);
        
        if(pq.size() > pq2.size() + 1) {
            
            pq2.add(pq.peek());
            
            pq.poll();
        
        } else if(pq2.size() > pq.size() + 1) {
            
            pq.add(pq2.peek());
        
            pq2.poll();
        }
        
        if(pq.size() == pq2.size()) ans[i] = (((pq.peek() + pq2.peek())/2));
        else if(pq.size() > pq2.size()) ans[i] = pq.peek();
        else ans[i] = pq2.peek();
        
    }
        return ans;
        
    }
}
