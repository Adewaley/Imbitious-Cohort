class Solution {
    public boolean isPowerOfTwo(int n) {
        //System.out.println(n);
        if(n < 1) return false;
        if(n < 2){
            return true;
        }else if(n % 2 == 1) {
            return false;
        }
        
        return isPowerOfTwo(n/2);
        
    }// time:O(n/2) --> O(n)
    //space: O(1)
}