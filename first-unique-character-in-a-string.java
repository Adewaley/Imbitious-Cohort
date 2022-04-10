class Solution {
    public int firstUniqChar(String s) {
        // Key: the character in the string 
        // Value: the count of the character
        HashMap<Character, Integer> checker = new HashMap<>();// map {}
        
        // add every character in the string to the hashset
        //  leetcode 
        for(int i = 0; i < s.length(); i++ ){ // i = t
            int count = checker.getOrDefault(s.charAt(i), 1);// count of t = 1
            if(checker.containsKey(s.charAt(i))){
                count++; // 1+1+1
            }
            checker.put(s.charAt(i), count);// map{l =1; e=3; t=1 }
            
        }
        System.out.println(checker);
        
        
        for(int i = 0; i < s.length(); i++ ){// i =0, el = l
            if (checker.get(s.charAt(i)) == 1){ // if the value(count) ==1  
                return i;
            }
        }
        
        return -1;
    }// space: O(n)
    // time: O(n)
}