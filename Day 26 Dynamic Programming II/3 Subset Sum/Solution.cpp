bool subsetSumToK(int n, int k, vector<int> &arr) {
	vector<int> dp(k + 1,0);
	vector<int> curr(k + 1,0);
	curr[0] = 1;
	// Base Case
	// Agar Index 0 pe koi value bachi hai and that value 
	// Equals To arr[0] then Yes
	if(arr[0] <= k) dp[arr[0]] = 1;
	dp[0] = 1;
	
	for(int i = 1; i < n; i++)
	{
		for(int j = 1; j <= k; j++)
		{
			bool take = false;
			if(j - arr[i] >= 0) take = dp[j-arr[i]];
			bool nottake = dp[j];
			curr[j] = (take | nottake);
		}
		dp = curr;
	}
	return dp[k];
}
