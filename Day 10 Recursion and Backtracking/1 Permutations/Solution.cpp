#include <bits/stdc++.h>

void allPermutations(int i, string nums, vector<string> &ans) {
        if(i == nums.size()) {
            ans.push_back(nums);
            return;
        }
        
        for(int j = i; j < nums.size(); j++) {
            swap(nums[i], nums[j]);
            allPermutations(i + 1, nums, ans);
            swap(nums[i], nums[j]);
        }
    }

vector<string> findPermutations(string &nums) {
    vector<string> ans;
        
        allPermutations(0, nums, ans);
        
        return ans;
}
