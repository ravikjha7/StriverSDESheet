#include <bits/stdc++.h> 
vector<int> ninjaAndSortedArrays(vector<int>& nums1, vector<int>& nums2, int m, int n) {
	vector<int> nums;
        int i = 0, j = 0;
        while(i < m && j < nums2.size()) {
            if(nums1[i] < nums2[j]) {
                nums.push_back(nums1[i]);
                i++;
            }
            else
            {
                nums.push_back(nums2[j]);
                j++;
            }
        }
        while(i < m) {
            nums.push_back(nums1[i]);
            i++;
        }
        while(j < nums2.size()) {
            nums.push_back(nums2[j]);
            j++;
        }
        return nums;
}
