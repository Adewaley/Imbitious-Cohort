class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> pMap = new HashMap<>();// {a:1, b:1, c:1}
        HashMap<Character, Integer> sMap = new HashMap<>();// {a:1, b:1, c:1}
        ArrayList<Integer> output = new ArrayList<>();
        int pLen = p.length();
        int sLen = s.length();
        
        if(pLen > sLen) return output;
        for (int i = 0; i < pLen; i ++) {
            char pChar = p.charAt(i);
            
            // for populating p map
            int pCount = pMap.getOrDefault(pChar, 1);
            if (pMap.containsKey(pChar)) {
                pCount++;
            }
            pMap.put(pChar, pCount);
            
            // for populating s map
            char sChar = s.charAt(i);
            int sCount = sMap.getOrDefault(sChar, 1);
            if (sMap.containsKey(sChar)) {
                sCount++;
            }
            sMap.put(sChar, sCount);
                  
        }
        // System.out.println(sMap);
        // System.out.println(pMap);
        
        
        int lp = 0;
        if(pMap.equals(sMap)) output.add(lp);
             
        for (int rp = pLen; rp < sLen; rp++){
            char toBeAdded = s.charAt(rp);
            sMap.put(toBeAdded, (sMap.getOrDefault(toBeAdded, 0)+1) );
            
            char toBeRemoved = s.charAt(lp);
            if(sMap.get(toBeRemoved) != null  && sMap.get(toBeRemoved) == 1){
                sMap.remove(toBeRemoved);
            }else{
                sMap.put(toBeRemoved, sMap.get(toBeRemoved)-1);
            }
            lp++;
            
            if (pMap.equals(sMap)) {
                output.add(lp);
            }
        }
        
        return output;
    }
}