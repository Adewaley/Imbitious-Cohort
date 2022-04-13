class Solution {
    public int findDuplicate(int[] nums) {
        // input: an array of numbers within the range [1-n]
        // output: the one duplicated number
        // need to use O(1) space, and thus cannot use any extra data structures
        // could sort the array then check element adjacent to each other
        
        // HashSet<Integer> duplicateChecker = new HashSet<>();
        
        Arrays.sort(nums); // O(nlogn)
        
        for (int i = 0; i < nums.length -1; i++){ // O(n)
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        
        return -1;
    }// sorting changed the run time to O(nlogn);
    // space is O(1);
}
