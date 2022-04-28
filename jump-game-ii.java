class Solution {
    public int jump(int[] nums) {
        // the greedy approach using
        // BFS
        
        int output = 0;
        int left = 0, right = 0;
        int rightBound = 0;
        
        while(right < nums.length - 1){
            rightBound = 0;
            for(int i = left; i <= right; i++){
                rightBound = Math.max(rightBound, (i+nums[i]));
            }
            left = right+1;
            right = rightBound;
            output++;
        }
        return output;
    }
}
