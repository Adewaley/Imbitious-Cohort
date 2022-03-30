class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int aPtr = 0;
        
        while(aPtr < image.length){
            int low = 0;
            int high = image[aPtr].length -1;
            
            while(low <= high ){
                if(image[aPtr][low] == image[aPtr][high]){
                    image[aPtr][low] = 1- image[aPtr][low];
                    image[aPtr][high] = image[aPtr][low];
                }
                low++;
                high--;
            }
            aPtr++;
        }
        return image;
    }// space: O(1);
    // time: O(n*n) --> O(n^2)
}