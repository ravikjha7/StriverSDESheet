import java.util.ArrayList;
import java.util.Stack;
import javafx. util. Pair;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> prices) {
        Stack<Pair<Integer, Integer>> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int price : prices) {
            if(st.isEmpty()) {
            Pair p = new Pair(price, 1);
            st.add(p);
            arr.add(1);
                continue;
        }
        int op = st.peek().getKey();
        if(op > price) {
            Pair p = new Pair(price, 1);
            st.add(p);
             arr.add(1);
        } else {
            int ans = 1;
            while(!st.isEmpty() && st.peek().getKey() <= price) {
                int count = st.pop().getValue();
                ans += count;
            }
            Pair p = new Pair(price, ans);
            st.add(p);
             arr.add(ans);
        }
        }
        return arr;
    }
}
