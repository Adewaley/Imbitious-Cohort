public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int oneBits = 0;
        int mask = 1;
        
        for (int i = 0; i < 32; i++){
            if((n & mask) != 0){
                oneBits++;
            }
            mask <<= 1;
        }
        return oneBits;
        
    }//time: O(32)--> O(1)
    // space: O(1)
}