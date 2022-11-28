class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        
        int n1 = word1.length();
        
        for (int i = 0; i < n1; i++) {
            freq[word1.charAt(i) - 'a']++;
        }
        
        int n2 = word2.length();
        
        for (int i = 0; i < n2; i++) {
            freq[word2.charAt(i) - 'a']--;
        }
        
        for (int num : freq) {
            if (Math.abs(num) > 3)
                return false;
        }
        
        return true;
    }
}
