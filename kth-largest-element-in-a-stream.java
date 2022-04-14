class KthLargest {

    // Exceeded time limit when using hashMaps instead of priority Queue
    
    int k = 0;
    PriorityQueue<Integer> kStream = new PriorityQueue<>();
    
    public KthLargest(int k, int[] nums) {
        for(int i = 0; i < nums.length; i++) this.kStream.offer(nums[i]);
        this.k = k;
    }
    
    public int add(int val) {
        this.kStream.offer(val);
        while(kStream.size() > k) kStream.poll();
        
        return kStream.peek();
    }//Space:O(n)
    // time: O(nlogn)
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */