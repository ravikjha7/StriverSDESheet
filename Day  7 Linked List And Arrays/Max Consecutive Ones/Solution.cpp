int curr = 0;
        int maxm = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] == 1) {
                curr++;
                maxm = max(maxm, curr);
            } else {
                curr = 0;
            }
        }
        return maxm;
    }
