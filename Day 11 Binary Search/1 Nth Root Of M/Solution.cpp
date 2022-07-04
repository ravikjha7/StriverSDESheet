double findNthRootOfM(int n, long long m) {
	double low = 1, high = m;
    double ans;
    int cnt = 80 ;
        while (cnt-- > 0)
        {
            double mid = (high + low) / 2 ;
            double pro = 1.0 ;
            
            for (int i = 0 ; i < n ; i++) pro *= mid ;
            if (pro > m) high = mid;
            else {
                low = mid ;
                ans = mid ;
            }
        }
    return ans;
}
