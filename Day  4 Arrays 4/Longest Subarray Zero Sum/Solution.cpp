#include <bits/stdc++.h> 
int LongestSubsetWithZeroSum(vector <int> arr) {
    int n = arr.size();
    int left[n] = {0};
    left[0] = arr[0];
    map<int,vector<int>> m;
    m[left[0]].push_back(0);
        int maxm = 0;
    for(int i = 1; i < arr.size(); i++) {
        left[i] = left[i-1] + arr[i];
        m[left[i]].push_back(i);
        if(left[i] == 0) maxm = i + 1;
    }
    for(auto i : m) {
        if(i.second.size() > 1) {
            maxm = max(maxm, i.second[i.second.size() - 1] - i.second[0]);
        }
    }
    return maxm;
}
