import java.util.*;

public class Solution {
    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> queries) {
        int n = arr.size();
        Collections.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < queries.size(); i++) {
            int e = queries.get(i).get(0);
            int m = queries.get(i).get(1);
            int a = -1;
            for(int j = 0; j < arr.size(); j++) {
                if(arr.get(j) > m) break;
                a = Math.max(a, arr.get(j) ^ e);
            }
            ans.add(a);
        }
        
        return ans;
    }
}
