class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> seen = new HashMap<>();
           
        for (int j = 0; j < nums.length; j++){
            int current = nums[j];
            
            if(seen.containsKey(current)){
                //System.out.println("val: " + seen.get(current) + " index: " + j);
                if( Math.abs(seen.get(current) - j) <= k) return true;
                
            }
            seen.put(nums[j], j);
        }
        return false;
    }// sapce: O(n)
    // time: O(n)
}