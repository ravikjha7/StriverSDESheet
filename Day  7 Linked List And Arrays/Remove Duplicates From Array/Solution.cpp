int removeDuplicates(vector<int> &nums, int n) {
	int low = 0;
        int o = -1e8;
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] != o) {
                o = nums[i];
                nums[low] = nums[i];
                low++;
            }
        }
        return low;
}
