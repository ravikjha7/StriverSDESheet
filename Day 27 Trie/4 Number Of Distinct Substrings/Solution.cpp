#include <bits/stdc++.h>
int distinctSubstring(string &word) {
    set<string> s;
    for(int i = 0; i < word.size(); i++) {
        string a = "";
        for(int j = i; j < word.size(); j++) {
            a += word[j];
            s.insert(a);
        }
    }
    return s.size();
}
