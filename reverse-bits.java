public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //ArrayList<Integer> flippedBits = new ArrayList<>();
        
        int output = 0;
        for(int i =0; i < 32; i++){
            int bit = (n >> i) & 1;
            output = output | (bit << (31 - i));
            // output <<=1;
            // if ((n & 1) == 1) output++;
            // n >>= 1;
        }
        return output;
    }// time:O(1)
    // space:O(1)
}