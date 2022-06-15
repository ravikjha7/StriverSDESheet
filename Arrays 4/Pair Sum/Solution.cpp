#include <bits/stdc++.h> 

bool mycomp(const vector<int> &a,const vector<int> &b) {
    if(a[0] < b[0]) return 1;
    if(a[0] > b[0]) return 0;
    if(a[1] < b[1]) return 1;
    return 0;
}
vector<vector<int>> pairSum(vector<int> &nums, int target) {
    vector<vector<int>> ans;
    map<int,vector<int>> m;
    for(int i = 0; i < nums.size(); i++)
    {
        if(m.find(target - nums[i]) != m.end())
        {
            int size = m[target-nums[i]].size();
            for(int j = 0; j < size; j++) {
                vector<int> a;
                a.push_back(nums[i]);
                a.push_back(target - nums[i]);
                ans.push_back(a);
            }
        }
        m[nums[i]].push_back(i);
    }
    for(int i = 0; i < ans.size(); i++)
    {
        sort(ans[i].begin(),ans[i].end());
    }
    sort(ans.begin(),ans.end(),mycomp);
    
    return ans;
}
