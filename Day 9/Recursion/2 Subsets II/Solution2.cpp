class Solution {
public:
    void allSubsets(int i, vector<int> &curr, vector<int> &nums, vector<vector<int>> &ans) {
        ans.push_back(curr);
        for(int j = i; j < nums.size(); j++) {
            if(j != i && nums[j] == nums[j - 1]) continue;
            curr.push_back(nums[j]);
            allSubsets(j + 1, curr, nums, ans);
            curr.pop_back();
        }
        
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<int> curr;
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        allSubsets(0, curr, nums, ans);
        return ans;
    }
};
