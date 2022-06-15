class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        map<char,int> m;
        int n = s.size();
        int ind = 0;
        int maxm = 0;
        int count = 0;
        for(int i = 0; i < n; i++) 
        {
            if(m.find(s[i]) == m.end()) {
                count++;
                maxm = max(maxm,count);
            } else {
                if(m[s[i]] >= ind) {
                    count = i - m[s[i]];
                    ind = m[s[i]] + 1;
                } else {
                    count++;
                    maxm = max(maxm,count);
                }
            }
            m[s[i]] = i;
        }
        return maxm;
    }
};
