class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int l = matrix[0].size() - 1;
        int m = 0;
        while(l >= 0 && m < matrix.size())
        {
            if(matrix[m][l] == target) return true;
            if(matrix[m][l] < target) m++;
            else l--;
        }
        return false;
    }
};
