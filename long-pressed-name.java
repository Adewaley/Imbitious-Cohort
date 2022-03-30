class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int p1 = 0;
        int p2 = 0;
        
        // a l e x 
        //     p1
        
        // a a l j e x
        //       p2
        
        if(name.equals(typed)) return true;
        
        int nlen = name.length();
        int tlen = typed.length();
        
        while(p2 < tlen){
            if(p1 < nlen && name.charAt(p1) == typed.charAt(p2)){
                p1++;
            }else if(p2 == 0 || typed.charAt(p2) != typed.charAt(p2-1)){
                return false;
            }
            p2++;
        }
        return p1 == nlen;
    }
    }// time: O(n)
    // space: O(1)
