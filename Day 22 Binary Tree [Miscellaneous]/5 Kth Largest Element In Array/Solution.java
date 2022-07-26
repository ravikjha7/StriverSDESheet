import java.util.*;

public class Solution {

	static int kthLargest(ArrayList<Integer> nums, int size, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums) {
            pq.add(i);
            if(pq.size() > k) pq.poll();
        }
        return pq.peek();
}
}
