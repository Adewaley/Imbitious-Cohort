class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nLen = nums1.length;
        int[] ans = new int[nLen];
        
        HashMap<Integer, Integer> checker = new HashMap<>();
        
        for (int i = 0; i < nums2.length; i++){
            checker.put(nums2[i], i); //{1:0, 3:1}
        }
        
        for(int i = 0; i < nLen; i++){
            if(checker.containsKey(nums1[i])){
                for(int j = 0; j < nums2.length; j++){
                    if(nums2[j] > nums1[i] && j > checker.get(nums1[i]) ){
                        ans[i] = nums2[j];
                        break;
                    }else{
                        ans[i] = -1;
                    }
                }
            }
        }
        return ans;
    }// time: O(n*m)
    // space: O(n)
}