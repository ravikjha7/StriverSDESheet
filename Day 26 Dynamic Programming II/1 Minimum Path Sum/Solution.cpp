#include <limits.h>
int minSumPath(vector<vector<int>> &grid) 
{
	int n = grid.size();
	int m = grid[0].size();
	vector<int> dp(m);
	for(int i = 0; i < n; i++)
	{
		vector<int> curr(m,0);
		curr[0] = dp[0] + grid[i][0];
		for(int j = 1; j < m; j++)
		{
			int left = INT_MAX;
			int up = INT_MAX;
			if(i > 0) up = dp[j];
			left = curr[j-1];
			curr[j] = min(left,up) + grid[i][j];
		}
		dp = curr;
	}
	return dp[m-1];
}
