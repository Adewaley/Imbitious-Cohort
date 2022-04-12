class Solution {
    public String[] findRelativeRanks(int[] score) {
         // first find the max in an array, and map it to 1
        // then map the next largest to 2, and so on
        // OR
        // just Map the scores to their ranks i.e {5: gold, 4:silver}
        
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        int len = score.length;
        
        // could alternatively remove the subsequent max from the array and find the next max
        int max = Arrays.stream(score).max().getAsInt();
        //System.out.println("Largest in given array is " +max);
        
        // sort the array and traverse from the back, since the max would at the end of the list after sorting
        // clone the scores array and use that for reference of the relative ranks in the array
        
        int[] clone = score.clone();
        Arrays.sort(clone);
        int k = 1;
        for(int i = len - 1; i >= 0; i--){
            map1.put(clone[i], k);
            k++;
        }
        
        String[] ans = new String[len];
        
        for(int j=0; j < len; j++){
            int rank = map1.get(score[j]);
            if(rank == 1){
                ans[j] ="Gold Medal";
            }
            else if(rank == 2){
                ans[j] ="Silver Medal";
            }
            else if(rank == 3 ){
                ans[j]="Bronze Medal";
            }
            else{
                ans[j]=String.valueOf(rank);
            }
        }
        return ans;
         
    }// space: O(n)
    // time: O(n)
}