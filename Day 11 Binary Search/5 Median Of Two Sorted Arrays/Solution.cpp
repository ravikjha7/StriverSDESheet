#include <bits/stdc++.h>
double median(vector<int> nums1, vector<int> nums2)
{
   int n = nums1.size();
        int m = nums2.size();
        int totalSize = n + m;
        int pos = (totalSize / 2);
        int low = -1e9, high = 1e9;
        while(low <= high) {
            int mid = low + (high - low)/2;
            
            int count = (upper_bound(nums1.begin(), nums1.end(), mid) - nums1.begin()) + (upper_bound(nums2.begin(), nums2.end(), mid) - nums2.begin());
            
                if(count <= pos) low = mid + 1;
                else high = mid - 1;
                
        }
        double ans = low;
        
        if(totalSize % 2 == 0) {
            pos--;
            low = -1e9, high = 1e9;
            while(low <= high) {
            int mid = low + (high - low)/2;
            
            int count = (upper_bound(nums1.begin(), nums1.end(), mid) - nums1.begin()) + (upper_bound(nums2.begin(), nums2.end(), mid) - nums2.begin());
            
                if(count <= pos) low = mid + 1;
                else high = mid - 1;
                
        }
            
        ans = (ans + low)/2.0;
            
        }
        return ans;
}
