#include <bits/stdc++.h>
int compareVersions(string v1, string v2) 
{
    int i = 0, j = 0;
        while(i < v1.size() || j < v2.size())
        {
            vector<int> v;
            while(i < v1.size() && v1[i] != '.')
            {
                if(v.size() == 0 && v1[i] != '0') v.push_back(v1[i]);
                else if(v.size() != 0) v.push_back(v1[i]);
                i++;
            }
            i++;
            vector<int> vv;
            // cout << "Mai AA Gaya Hu" << endl;
            while(j < v2.size() && v2[j] != '.')
            {
                if(vv.size() == 0 && v2[j] != '0') vv.push_back(v2[j]);
                else if(vv.size() != 0) vv.push_back(v2[j]);
                j++;
            }
            j++;
            if(v.size() < vv.size()) return -1;
            if(v.size() > vv.size()) return 1;
            for(int i = 0; i < v.size(); i++)
            {
                if(v[i] - '0' < vv[i] - '0') return -1;
                if(v[i] - '0' > vv[i] - '0') return 1;
            }
        }
        return 0;
}
