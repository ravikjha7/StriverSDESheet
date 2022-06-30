#include <bits/stdc++.h>

static bool myComp(pair<int,int> &a, pair<int, int> &b) {
    return a.second*1.0/a.first > b.second*1.0/b.first;
}

double maximumValue (vector<pair<int, int>>& items, int n, int w)
{
    double ans = 0.0;
    sort(items.begin(), items.end(), myComp);
    
    
    for(int i = 0; i < items.size(); i++) {
        if(w >= items[i].first) {
            ans += items[i].second;
            w -= items[i].first;
        } else {
            double v = (items[i].second*1.0)/items[i].first;
            ans += (w * v);
            w = 0;
        }
    }
    
    return ans;
    
}
