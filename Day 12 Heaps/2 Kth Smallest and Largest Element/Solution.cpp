#include <bits/stdc++.h>
vector<int> kthSmallLarge(vector<int> &nums, int n, int k)
{
    int temp = k;
    priority_queue<int, vector<int>, greater<int>> pq1;
          int ans;
    for(auto i : nums) pq1.push(i);
       while(k--) {
           ans = pq1.top();
           pq1.pop();
       }
            k = temp;
    vector<int> a;
    a.push_back(ans);
    
	priority_queue<int> pq;
        for(auto i : nums) pq.push(i);
  
        while(k--) {
            ans = pq.top();
            pq.pop();
        }

    a.push_back(ans);
    
    
    return a;
}
