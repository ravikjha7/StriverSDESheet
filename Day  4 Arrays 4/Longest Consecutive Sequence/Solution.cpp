#include <bits/stdc++.h> 
int lengthOfLongestConsecutiveSequence(vector<int> &nums, int n) {
        set<int> st;
        
        if(nums.size() == 0) return 0;
        
        for(int i = 0; i < nums.size(); i++) {
            st.insert(nums[i]);
        }
        
        int prev = INT_MIN,curr = 1,maxm = 1;
        for(auto i : st) {
            if(i == prev + 1) {
                curr++;
                maxm = max(maxm, curr);
                prev = i;
            } else {
                prev = i;
                curr = 1;
            }
        }
        
        return maxm;
}
