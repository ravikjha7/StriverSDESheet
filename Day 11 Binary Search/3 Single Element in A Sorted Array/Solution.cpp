int uniqueElement(vector<int> arr, int n)
{
        int low = 0, high = n - 1;
        
        while(low <= high)
        {
            int mid = (low + high)/2;
                        
            if(mid < n - 1 && arr[mid] == arr[mid + 1]) {
                if(mid % 2 == 0) low = mid + 1;
                else high = mid - 1;
            }
            else if(mid > 0 && arr[mid] == arr[mid - 1]) {
                if (mid % 2 == 0) high = mid - 1;
                else low = mid + 1;
            }
            else return arr[mid];
        }
        
        return -1;
}
