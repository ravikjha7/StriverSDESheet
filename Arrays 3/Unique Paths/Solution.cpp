class Solution {
public:
    int uniquePaths(int m, int n) {
        int p = m + n - 2;
        int r = n - 1;
        double ans = 1;
        for(int i = 1; i <= r; i++)
        {
            ans = ans * (p - r + i)/i;
        }
        return (int)ans;
    }
};
