class Solution {
    public String longestNiceSubstring(String s) {
        HashSet<Character> checker = new HashSet<>(); // {Y, y, a, A, z} --> O(n)
        char[] alphabetArr = s.toCharArray(); // [Y, a, z, a, A, a, y] --> O(n)
        
        for(char x: alphabetArr) checker.add(x);
        
        for(int i = 0; i < alphabetArr.length; i++){
            char current = alphabetArr[i];
            char currUpp = Character.toUpperCase(current); // A
            char currLow = Character.toLowerCase(current); // a
            if(checker.contains(currUpp) && checker.contains(currLow)){
                continue;
            }
            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i+1));
            
            return left.length() >= right.length() ? left : right;
        }
        return s;
    }// Space: O(n)
    // time: O(n^2) worst case, O(nlogN) average
}