class Solution {
public:
    void allSubsets(int i, vector<int> &curr, vector<int> &nums, set<vector<int>> &s) {
        if(i < 0) {
            s.insert(curr);
            return;
        }
        
        curr.push_back(nums[i]);
        allSubsets(i - 1, curr, nums, s);
        
        curr.pop_back();
        allSubsets(i - 1, curr, nums, s);
        
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        set<vector<int>> s;
        vector<int> curr;
        sort(nums.begin(), nums.end());
        allSubsets(nums.size() - 1, curr, nums, s);
        vector<vector<int>> ans;
        for(auto i : s) ans.push_back(i);
        return ans;
    }
};
