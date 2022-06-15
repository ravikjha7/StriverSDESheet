#include <bits/stdc++.h> 
int subarraysXor(vector<int> &arr, int x)
{
    int prefix[arr.size()];
    prefix[0] = arr[0];
    for(int i = 1; i < arr.size(); i++) prefix[i] = prefix[i-1] ^ arr[i];
    map<int,int> m;
    int ans = 0;
    for(int i = 0; i < arr.size(); i++) {
        int curr = x ^ prefix[i];
        ans += m[curr];
        if(prefix[i] == x) ans++;
        m[prefix[i]]++;
    }
    return ans;
}
