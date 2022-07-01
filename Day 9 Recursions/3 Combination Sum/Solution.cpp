void allCombinations(int i, vector<int> &candidates, int target, vector<int> &curr, vector<vector<int>> &ans) {
        if(i == candidates.size()) {
            if(target == 0) ans.push_back(curr);
            return;
        }
        curr.push_back(candidates[i]);
        allCombinations(i + 1, candidates, target - candidates[i], curr, ans);
        curr.pop_back();
        allCombinations(i + 1, candidates, target, curr, ans);
    }
vector<vector<int>> findSubsetsThatSumToK(vector<int> candidates, int n, int k)
{
    // sort(candidates.rbegin(), candidates.rend());
    vector<vector<int>> ans;
        vector<int> curr;
        allCombinations(0, candidates, k, curr, ans);
        return ans;
}
