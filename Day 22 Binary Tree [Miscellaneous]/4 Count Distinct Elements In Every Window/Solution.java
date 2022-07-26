import java.util.*;

public class Solution 
{
	public static ArrayList<Integer> countDistinct(ArrayList<Integer> arr, int n, int k) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < k; i++) {
            
            if(!hm.containsKey(arr.get(i))) hm.put(arr.get(i), 1);
            else hm.put(arr.get(i), hm.get(arr.get(i)) + 1);
        
        }
        ans.add(hm.size());
        for(int i = k; i < n; i++) {
            
            if(!hm.containsKey(arr.get(i))) hm.put(arr.get(i), 1);
            else hm.put(arr.get(i), hm.get(arr.get(i)) + 1);
            
            hm.put(arr.get(i - k), hm.get(arr.get(i - k)) - 1);
            if(hm.get(arr.get(i - k)) == 0) hm.remove(arr.get(i - k));
            
            ans.add(hm.size());
        }
        return ans;
    }
}


