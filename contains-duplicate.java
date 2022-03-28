class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); // O(1) initializing the hash set
        
        for(int i = 0; i < nums.length; i++){ // O(n) where n is the number of elements in the array
            if (seen.contains(nums[i])){ // O(1) checking if we've seen the number
                return true; // O(1) return true if condition is met
            }else{
                seen.add(nums[i]);
            }         
        }
        return false;
        
    }// Space O(n)
    // time: O(n)
}