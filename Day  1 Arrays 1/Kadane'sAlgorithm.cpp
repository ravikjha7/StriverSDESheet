#include <bits/stdc++.h> 
long long maxSubarraySum(int arr[], int n)
{
    long long curr = 0;
    long long maxm = 0;
    for(int i = 0; i < n; i++)
    {
        curr += arr[i];
        maxm = max(maxm,curr);
        if(curr < 0) curr = 0;
    }
    return maxm;
}
