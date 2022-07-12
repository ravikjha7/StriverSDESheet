import java.util.*;

public class Solution {
    public static int[] maxMinWindow(int[] arr, int n) {
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            
            if(st.isEmpty()) left[i] = -1;
            else left[i] = st.peek();
            
            st.push(i);
        }
        
        while(!st.isEmpty()) st.pop();
        
        for(int i = n - 1; i >= 0; i--) {
            
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            
            if(st.isEmpty()) right[i] = n;
            else right[i] = st.peek();
            
            st.push(i);
        }
        
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) ans[i] = Integer.MIN_VALUE;
        
        int[] win = new int[n] ;
        for(int i = 0 ; i < n ; i++) {
            
            win[i] = right[i] - left[i] - 1 ;
   
            ans[win[i] - 1] = Math.max(ans[win[i] - 1], arr[i]);
            
        }
        
        for(int i = n - 2; i >= 0; i--) ans[i] = Math.max(ans[i], ans[i + 1]);
        
        return ans;
    }
}

