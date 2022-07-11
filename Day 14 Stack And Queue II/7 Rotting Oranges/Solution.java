import java.io.*;
import java.util.*;
import javafx.util.Pair;  

public class Solution {

	public static int minTimeToRot(int[][] grid, int n, int m) {
		Stack<Pair<Integer, Integer>> st = new Stack<>();
        int count = 0;
        int total = 0;
        
        for(int i = 0; i < grid.length; i++) {
            
            for(int j = 0; j < grid[i].length; j++) {
                
                if(grid[i][j] == 2) {
                    
                    Pair p = new Pair(i, j);
    
                    st.add(p);
                    
                    total++;
                    
                } else if(grid[i][j] == 1) count++;
                
            }
        }
        
        // System.out.println(count);
        
        int ans = 0;
        int curr = 0;
        while(!st.isEmpty()) {
            
            curr = total;
            total = 0;
            
            Stack<Pair<Integer, Integer>> st2 = new Stack<>();
            
            while(curr-- > 0) {

            Pair<Integer, Integer> top = st.pop();
            
            int i = top.getKey();
            int j = top.getValue();
            
            if(i != 0) if(grid[i - 1][j] == 1) {
                
                grid[i - 1][j] = 2;
                
                Pair p = new Pair(i - 1, j);
    
                st2.add(p);
                
                count--;
                
                total++;
            }
            
            if(i != grid.length - 1) if(grid[i + 1][j] == 1) {
                
                grid[i + 1][j] = 2;
                
                Pair p = new Pair(i + 1, j);
    
                st2.add(p);
                
                count--;
                
                total++;
            }
            
            if(j != grid[0].length - 1) if(grid[i][j + 1] == 1) {
                
                grid[i][j + 1] = 2;
                
                Pair p = new Pair(i, j + 1);
    
                st2.add(p);
                
                count--;
                
                total++;
            }
                
            if(j != 0) if(grid[i][j - 1] == 1) {
                
                grid[i][j - 1] = 2;
                
                Pair p = new Pair(i, j - 1);
    
                st2.add(p);
                
                count--;
                
                total++;
            }
        }
            st = st2;
            if(total != 0) ans++;
        }
        
        
        
        // System.out.println(count);
        
        if(count == 0) return ans;
        return -1;
	}

}
