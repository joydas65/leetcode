class Solution {
    Map<String, Integer> wordCount = new HashMap<>();
    int n, k, wordLength, substringSize;
    
    public void slidingWindow(int left, String s, List<Integer> answer) {
        
        Map<String, Integer> wordsFound = new HashMap<>();
        
        boolean excessWord = false;
        
        int wordsUsed = 0;
        
        for (int right = left; right <= n - wordLength; right += wordLength) {
            String sub = s.substring(right, right + wordLength);
            
            if (!wordCount.containsKey(sub)) {
                wordsFound.clear();
                wordsUsed = 0;
                excessWord = false;
                left = right + wordLength;
            } else {
                while (right - left == substringSize || excessWord) {
                    String leftMostWord = s.substring(left, left + wordLength);
                    
                    left += wordLength;
                    
                    wordsFound.put(leftMostWord, wordsFound.get(leftMostWord) - 1);
                    
                    if (wordsFound.get(leftMostWord) >= wordCount.get(leftMostWord)) {
                        excessWord = false;
                    } else {
                        wordsUsed--;
                    }
                }
                
                wordsFound.put(sub, wordsFound.getOrDefault(sub, 0) + 1);
                
                if (wordsFound.get(sub) <= wordCount.get(sub)) {
                    wordsUsed++;
                } else {
                    excessWord = true;
                }
                
                if (wordsUsed == k && !excessWord) {
                    answer.add(left);
                }
            }
        }
    }
    
    public List<Integer> findSubstring(String s, String[] words) {
        n = s.length();
        k = words.length;
        wordLength = words[0].length();
        substringSize = wordLength * k;
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < wordLength; i++) {
            slidingWindow(i, s, answer);
        }
        
        return answer;
    }
}
