#include <bits/stdc++.h> 
int findDuplicate(vector<int> &arr, int n){
        int fast = arr[0];
        int slow = arr[0];
        fast = arr[arr[fast]];
        slow = arr[slow];
        while(fast != slow) {
            fast = arr[arr[fast]];
            slow = arr[slow];
        }
        fast = arr[0];
        while(fast != slow) {
            fast = arr[fast];
            slow = arr[slow];
        }
        return slow;
}
