#include <bits/stdc++.h>
bool isPalindrome(string s) {
        if(s.size() == 0) return false;
        int n = s.size();
        for(int i = 0; i < n; i++) {
            if(s[i] != s[n - 1 - i]) return false;
        }
        return true;
    }
    
    void palindromePartition(int i, string &s, string st, vector<string> &curr, vector<vector<string>> &ans) {
        if(i == s.size()) {
            if(!isPalindrome(st)) return;
            curr.push_back(st);
            ans.push_back(curr);
            curr.pop_back();
            return;
        }
        st += s[i];
        palindromePartition(i + 1, s, st, curr, ans);
        if(st.size()) st.pop_back();
        if(isPalindrome(st)) {
            curr.push_back(st);
            st = s[i];
            palindromePartition(i + 1, s, st, curr, ans);
            curr.pop_back();
        }
    }
vector<vector<string>> partition(string &s) 
{
        vector<vector<string>> ans;
        vector<string> curr;
        if(s.size() == 0) {
            ans.push_back(curr);
            return ans;
        }
        string st = "";
        palindromePartition(0, s, st, curr, ans);
        return ans;
}
