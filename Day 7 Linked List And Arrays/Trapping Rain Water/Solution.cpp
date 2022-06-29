class Solution {
public:
    int trap(vector<int>& arr) {
        int low = 0, high = arr.size() - 1;
        int left = 0, right = 0;
        int ans = 0;
        while(low <= high) {
            
        left = max(left, arr[low]);
        
        right=max(right, arr[high]);
            
            if(left <= right){
                ans += left - arr[low++];
            }
            else if(left >= right){
               ans += right - arr[high--];              
            }
        }
    return ans;
    }
};
