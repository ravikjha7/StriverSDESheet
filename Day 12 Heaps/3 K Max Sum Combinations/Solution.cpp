#include <bits/stdc++.h>
vector<int> kMaxSumCombination(vector<int> &a, vector<int> &b, int n, int k){
    priority_queue<int, vector<int>, greater<int>> pq;
    for(auto i : a) {
        for(auto j : b) {
            if(pq.size() < k) pq.push(i + j);
            else {
                if(pq.top() < (i + j)) {
                    pq.pop();
                    pq.push(i + j);
                }
            }
        }
    } 
    vector<int> ans;
    while(k--) {
        ans.push_back(pq.top());
        pq.pop();
    }
    reverse(ans.begin(), ans.end());
    return ans;
}
