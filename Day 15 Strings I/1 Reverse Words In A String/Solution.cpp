#include <bits/stdc++.h>
string reverseString(string s)
{
    string ans = "";
        reverse(s.begin(), s.end());
        string curr = "";
        for(int i = 0; i < s.size(); i++) {
            if(s[i] == ' ') {
                if(curr != "") {
                    reverse(curr.begin(), curr.end());
                    if(ans == "") ans = curr;
                    else ans += (" " + curr);
                }
                curr = "";
            } else curr += s[i];
        }
        if(curr != "") {
            reverse(curr.begin(), curr.end());
            if(ans == "") ans = curr;
            else ans += (" " + curr);
        }
        return ans;
}
