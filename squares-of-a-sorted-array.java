class Solution {
     public int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];
        //System.out.println((-4)*(-4));
        
        for(int i = 0; i < nums.length; i++){
            output[i] = nums[i] * nums[i]; // -4 * -4
        }// [16, 1, 0, 9, 100] --> [0, 1, 9, 16, 100]
        Arrays.sort(output);
        return output;
    }
}