class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        
        for(int i =1; i < nums.length; i++){
            if(i <= max){
                max = Math.max(max, i+nums[i]);
            }    
            
        }
        return (max >= nums.length -1);
        
    }
    // would always start from the first index(0)
    // Match: Math.MAX, Math.MIN
    // if the value of the index+value is greater than max -> then replace the max with index+value
    // as long as the max is >= i -> then we can keep progressing
}
