class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        // sort the array and ensure that the difference between consecutive numbers is consistent
        int diff = 0;
        Arrays.sort(arr); // O(nlogn)
        diff = arr[1] - arr[0];
        
        for (int i = 1; i < arr.length -1; i++){ // O(n)
            if(diff != (arr[i+1] - arr[i])){
                return false;
            }
            diff = arr[i+1] - arr[i];
        }
        
        return true;
    }// time: O(nlogn)
    // space: O(1);
}