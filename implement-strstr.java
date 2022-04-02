class Solution {
    public int strStr(String haystack, String needle) {
        int window = needle.length();
        int haySize = haystack.length();
        
        if(window > haySize) return -1; 
        if(window < 1) return 0;   
        
        for (int i = 0; i < (haySize+1) - window; i++){
            for(int j = 0; j < window; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                    
                }
                if(j == window -1){
                    return i;
                }
            }
            
        }
       return -1;
    }//space: O(1)
    // time: O(n*m)
}