#include <bits/stdc++.h>

long long merge(int low,int mid,int high,long long *arr,long long sorted[])
{
    
    int i = low,j = mid + 1,k = low;
    long long ans = 0;
    while(i <= mid && j <= high)
    {
        if(arr[i] <= arr[j]) {
            sorted[k] = arr[i];
            i++;
            k++;
        } else {
            sorted[k] = arr[j];
            j++;
            k++;
            ans += (mid + 1 - i);
        }
    }
    while(i <= mid)
    {
        sorted[k] = arr[i];
        i++;
        k++;
    }
    while(j <= high)
    {
        sorted[k] = arr[j];
        j++;
        k++;
    }
    for(int i = low; i <= high; i++) arr[i] = sorted[i];
    return ans;
}

long long countInversions(int low, int high, long long *arr,long long sorted[])
{
    int mid = (low + high)/2;
    long long ans = 0;
    if(low < high)
    {
        ans += countInversions(low,mid,arr,sorted);
        ans += countInversions(mid + 1,high,arr,sorted);
        
        ans += merge(low,mid,high,arr,sorted);
    }
    return ans;
}

long long getInversions(long long *arr, int n) {
    long long sorted[n];
    long long ans = countInversions(0,n-1,arr,sorted);
    return ans;
}
