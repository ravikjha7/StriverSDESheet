class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length ;
   
        int ans = -1 ;
          
        int ans2 = -1 ;
        
        int cnt1 = 0, cnt2 = 0 ;
        
        for (int i = 2; i < n ; i++)
        {
            if (arr[i] == ans) {
                cnt1++ ;
            }
            else if (arr[i] == ans2){
                cnt2++ ;
            } else if (cnt1 == 0) {
                ans = arr[i] ;
                cnt1 = 1 ;
            } else if (cnt2 == 0){
                ans2 = arr[i] ;
                cnt2 = 1 ;
            } else {
                cnt1-- ;
                cnt2-- ;
            }     
        }
        
        cnt1 = cnt2 = 0 ;
        for (int i = 0 ; i < n ; i++)
        {
            if (arr[i] == ans) cnt1++ ;
            else if (arr[i] == ans2) cnt2++ ;
        }
        
        ArrayList<Integer> ansList = new ArrayList<>() ;
        if (cnt1 > n/3) ansList.add(ans) ;
        if (cnt2 > n/3) ansList.add(ans2) ;
        
        return ansList ;
    }
}
