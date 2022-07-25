import java.util.*;
public class Kthlargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int K;
    Kthlargest(int k, int[] nums) {
        K = k;
        for(int x : nums) {
            pq.add(x);
            if(pq.size() > k) {
                pq.poll();
            }
        }
    }

    void add(int val) {
        pq.add(val);
        if(pq.size() > K) {
            pq.poll();
        }
    }

    int getKthLargest() {
        return pq.peek();
    }
}
