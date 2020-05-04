class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransom = new HashMap<Character, Integer>();
        
        HashMap<Character, Integer> maga = new HashMap<Character, Integer>();
        
        int n = ransomNote.length(), m = magazine.length();
        
        for(int i = 0; i < n; i++){
            char c = ransomNote.charAt(i);
            
            if(ransom.containsKey(c)){
                ransom.put(c, ransom.get(c) + 1);
            }else{
                ransom.put(c, 1);
            }
        }
        
        for(int i = 0; i < m; i++){
            char c = magazine.charAt(i);
            
            if(maga.containsKey(c)){
                maga.put(c, maga.get(c) + 1);
            }else{
                maga.put(c, 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : ransom.entrySet()){
            if(!maga.containsKey(entry.getKey()))
                return false;
            if(entry.getValue() > maga.get(entry.getKey()))
                return false;
        }
        return true;
    }
}
