public class Solution {

    public static int maximumXor(int[] A) {
        
        int n = A.length;
        int maxm = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                maxm = Math.max(maxm, A[i] ^ A[j]);
            }
        }
        
        return maxm;
    }
}
