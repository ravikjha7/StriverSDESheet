#include <bits/stdc++.h> 

pair<int,int> missingAndRepeating(vector<int> &arr, int n)
{
    int x = 0;
    for(int i = 1; i <= n; i++) x ^= i;
    for(int i = 0; i < n; i++) x ^= (arr[i]);
    int mask = x & ~(x - 1);
    int x1 = 0,x2 = 0;
    for(int i = 1; i <= n; i++)
    {
        if((i & mask)) {
            x1 ^= i;
        } else {
            x2 ^= i;
        }
    }
    for(int i = 0; i < n; i++) {
        if((arr[i] & mask)) {
            x1 ^= arr[i];
        } else {
            x2 ^= arr[i];
        }
    }
    int c = 0;
    for(int i = 0; i < n; i++) {
        if(arr[i] == x1) c++;
    }
    if(c == 0) return {x1,x2};
    return {x2,x1};
}
