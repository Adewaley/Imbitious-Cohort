class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] output = new int[n];
        int minSoFar = Integer.MIN_VALUE+n;
        //System.out.println(minSoFar);
        
        // O(n)
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == c){
              minSoFar = i;  
            }
            output[i] = i - minSoFar;
        }
        //System.out.println(Arrays.toString(output));
        
        // O(n)
        for(int i = n-1; i >= 0; i--){
            if(s.charAt(i) == c){
              minSoFar = i;  
            }
            output[i] = Math.min(output[i], Math.abs(i - minSoFar));
        }
        
        return output;
        
    }// space: O(n);
    // time : O(n);
}
