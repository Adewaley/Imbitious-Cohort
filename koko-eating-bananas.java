class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        Arrays.sort(piles);
        int l = 0;
        int r = piles[piles.length - 1];
        int res = r;
        
        while(l < r){
            int mid = (l+r)/2;
            int hours = 0;
            
            for(int pile: piles){
                hours += Math.ceil((double)pile / mid);
            }
            
            if( hours <= h){
                r = mid;
            }else{
                l = mid +1;
            }
        }
        return r;
    }
}
