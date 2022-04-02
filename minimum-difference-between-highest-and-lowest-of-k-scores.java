class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        
        int l = 0;
        int r = k-1;
        int output = Integer.MAX_VALUE;
        
        while(r < nums.length){
            output = Math.min(output, nums[r] - nums[l]);
            l++;
            r++;
        }
        return output;
    }// space: O(1)
    // time: O(n)
}