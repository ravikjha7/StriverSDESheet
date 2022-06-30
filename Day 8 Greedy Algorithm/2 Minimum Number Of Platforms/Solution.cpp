int calculateMinPatforms(int a[], int b[], int n) {
        int noOfTrains[2401] = {0};
    
        for(int i = 0; i < n; i++) {
            noOfTrains[a[i]]++ ;
            noOfTrains[b[i] + 1]-- ;
        }
        
        int maxm = 0 ;
        int curr = 0 ;
        for(int i = 0; i < 2401; i++) {
            curr += noOfTrains[i] ;
            maxm = max(maxm, curr);
        }
        
        return maxm;
}
