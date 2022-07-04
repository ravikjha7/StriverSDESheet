#include <bits/stdc++.h>

int lessThanMid(vector<vector<int>> &matrix, int mid) {
    int ans = 0;
    for(int i = 0; i < matrix.size(); i++) {
        ans += (lower_bound(matrix[i].begin(), matrix[i].end(), mid) - matrix[i].begin());
    }
    return ans;
}

int getMedian(vector<vector<int>> &matrix)
{
    int low = 1, high = 1e5;
    
    while(low <= high) {
        int mid = (low + high) / 2;
        int count = lessThanMid(matrix, mid);
        if(count <= (matrix.size()*matrix[0].size())/2) low = mid + 1;
        else high = mid - 1;
    }
    
    return low - 1;
}
