#include <bits/stdc++.h>
vector<int> nextSmallerElement(vector<int> &arr, int n)
{
    stack<int> st;
    for(int i = n - 1; i >= 0; i--) {
        while(!st.empty() && st.top() >= arr[i]) st.pop();
        int x = st.empty()? -1 : st.top() ;
            
            st.push(arr[i]) ;
            
            arr[i] = x ; 
        }
    return arr;
}
