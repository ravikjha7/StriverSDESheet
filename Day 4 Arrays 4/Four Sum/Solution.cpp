#include <bits/stdc++.h> 
string fourSum(vector<int> nums, int target, int n) {
    sort(nums.begin(),nums.end());
        set<vector<int>> ans;
        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                int t2 = target - nums[i] - nums[j];
                int low = j + 1;
                int high = nums.size() - 1;
                
                while(low < high) {
                    if(nums[low] + nums[high] < t2) low++;
                    else if(nums[low] + nums[high] > t2) high--;
                    else {
                        vector<int> temp;
                        temp.push_back(nums[low]);
                        temp.push_back(nums[high]);
                        temp.push_back(nums[i]);
                        temp.push_back(nums[j]);
                        ans.insert(temp);
                        low++;
                        high--;
                    }
                }
            }
        }
        if(ans.size() == 0) return "No";
    return "Yes";
}
