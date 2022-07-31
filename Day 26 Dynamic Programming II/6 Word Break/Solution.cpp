#include <bits/stdc++.h>

bool wordBreak(vector < string > & arr, int n, string & target) {
        unordered_set<string> hs;
        
        for(int i = 0; i < n; i++) hs.insert(arr[i]);
        
        vector<string> v;
        
        v.push_back("");
        
        bool flag = false;
        for(int i = 0; i < target.size(); i++) {
            flag = false;
            for(int j = 0; j < v.size(); j++) {
                v[j] += target[i];
                // cout << v[j] << " ";
                if(hs.find(v[j]) != hs.end()) flag = true;
            }
            if(flag) v.push_back("");
        }
        
    return flag;
    
}
