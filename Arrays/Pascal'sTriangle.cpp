#include <bits/stdc++.h> 
vector<vector<long long int>> printPascal(int n) 
{
    vector<vector<long long int>> ans(n);
    for(int i = 0; i < n; i++)
    {
        ans[i] = vector<long long int> (i + 1);
    }
    ans[0][0] = 1;
    for(int i = 1; i < n; i++)
    {
        for(int j = 0; j <= i; j++)
        {
            long long int sum = 0;
            if(j != 0) sum += ans[i-1][j-1];
            if(j != i) sum += ans[i-1][j];
            ans[i][j] = sum;
        }
    }
    return ans;
}
