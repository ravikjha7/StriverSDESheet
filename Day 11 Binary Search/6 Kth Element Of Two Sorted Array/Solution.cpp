int ninjaAndLadoos(vector<int> &row1, vector<int> &row2, int m, int n, int k) {
    int low = 0, high = 1e5;
    while(low <= high) {
        int mid = low + (high-low)/2;
        
        int count = (upper_bound(row1.begin(), row1.end(), mid) - row1.begin()) + (upper_bound(row2.begin(), row2.end(), mid) - row2.begin());
        
        if(count < k) low = mid + 1;
        else high = mid - 1;
    }
    
    return low;
    
}
