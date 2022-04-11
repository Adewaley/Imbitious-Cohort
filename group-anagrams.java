class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> wordCount = new HashMap<>();// {e:1}
        //List<List<String>> result = new ArrayList<>();
        
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        for (String word : strs) {
            char[] count = new char[26]; // count of every charcter in the strs array with 
                                        // the element at the ith index representing the count of 
                                        // ith character of the alphabet
            for (char c : word.toCharArray()) count[c - 'a']++;  //[a: 80 - 80], [b: 81-80]...
            String key = String.valueOf(count);
            
            if (!wordCount.containsKey(key)) wordCount.put(key, new ArrayList<>());
            wordCount.get(key).add(word);
        }
        return new ArrayList<>(wordCount.values());
    }// sapce:O(n)
    // time:O(m*n)

}