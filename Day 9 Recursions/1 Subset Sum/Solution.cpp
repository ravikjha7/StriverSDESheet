void allSubsets(int i, int sum, vector<int> &nums, vector<int> &ans) {
    if(i < 0) {
        ans.push_back(sum);
        return;
    }
    allSubsets(i - 1, sum + nums[i], nums, ans);
    allSubsets(i - 1, sum, nums, ans);
}

vector<int> subsetSum(vector<int> &nums)
{
    vector<int> ans;
    allSubsets(nums.size() - 1, 0, nums, ans);
    sort(ans.begin(), ans.end());
    return ans;
}
