#include <bits/stdc++.h> 
int maximumProfit(vector<int> &prices){
    int maxm = 0;
    int minm = prices[0];
    for(int i = 0; i < prices.size(); i++)
    {
        maxm = max(maxm,prices[i] - minm);
        minm = min(minm,prices[i]);
    }
    return maxm;
}
