#include <bits/stdc++.h> 
void setZeros(vector<vector<int>> &matrix)
{
	int n = matrix.size();
    int m = matrix[0].size();
    bool flag = true;
    for(int i = 0; i < n; i++)
    {
        if(matrix[i][0] == 0) flag = false;
        for(int j = 1; j < m; j++)
        {
            if(matrix[i][j] == 0)
            {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }
    for(int i = n - 1; i >= 0; i--)
    {
        for(int j = m - 1; j >= 1; j--)
        {
            if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
        }
        if(flag == false) matrix[i][0] = false;
    }
   
}
