#include <bits/stdc++.h>
void allWords(int i, vector<string> &curr, string word, vector<string> &ans, string &s, set<string> &dictionary) {
    if(i == s.size()) {
        if(word.size() == 0) {
        string temp = "";
        for(auto i : curr) temp += i, temp += " ";
        temp.pop_back();
        ans.push_back(temp);
        }
        return;
    }
    word += s[i];
    if(dictionary.find(word) != dictionary.end()) {
        curr.push_back(word);
        allWords(i + 1, curr, "", ans, s, dictionary);
        curr.pop_back();
    }
    allWords(i + 1, curr, word, ans, s, dictionary);
    
}

vector<string> wordBreak(string &s, vector<string> &dictionary)
{
    vector<string> ans;
    vector<string> curr;
    set<string> ogDictionary;
    for(auto i : dictionary) ogDictionary.insert(i);
    allWords(0, curr, "", ans, s, ogDictionary);
    return ans;
}
