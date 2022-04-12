class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         HashMap<Integer, Integer> map2 = new HashMap<>(); // key: ind, val: el
        
        int[] output = new int[arr1.length];
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr2.length; i++){
            map2.put(arr2[i], i);
        }
        
        // sort the elements that exist in both arrays 
        int indexer = 0;
        for(int i = 0; i < arr2.length; i++){
            int comparator = arr2[i];
           
            for(int j = 0; j < arr1.length; j++ ){
                if(arr1[j] == comparator){
                    result.add(arr1[j]);
                    // output[indexer] = arr1[j];
                    // indexer++;
                }
            }
        }
        
        // sort the leftover elements in array 1 that are not in array 2
        ArrayList<Integer> leftovers = new ArrayList<>();
        for(int i =0; i < arr1.length; i++){
            int leftover = arr1[i];
            if(!(map2.containsKey(leftover))){
                leftovers.add(leftover);
                //result.add(leftover);
            }
        }
        Collections.sort(leftovers);
        for(int i = 0; i < leftovers.size(); i++) result.add(leftovers.get(i));
        for(int i = 0; i < result.size(); i++) output[i] = result.get(i);// convert the list back to array
        return output;
    }// space: O(n)
}   // time: O(m*n)