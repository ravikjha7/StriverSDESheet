#include <bits/stdc++.h>
void allCombinations(int i, vector<int> &curr, vector<vector<int>> &ans, vector<int> &candidates, int target) {
        if(target == 0) {
            ans.push_back(curr);
            return;
        }
        if(target < 0) return;
        for(int j = i; j < candidates.size(); j++) {
            if(j != i && candidates[j] == candidates[j - 1]) continue;
            curr.push_back(candidates[j]);
            allCombinations(j + 1, curr, ans, candidates, target - candidates[j]);
            curr.pop_back();
        }
    }
vector<vector<int>> combinationSum2(vector<int> &candidates, int n, int target)
{
	vector<int> curr;
        vector<vector<int>> ans;
        sort(candidates.begin(), candidates.end());
        allCombinations(0, curr, ans, candidates, target);
        return ans;
}
