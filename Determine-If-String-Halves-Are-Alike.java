class Solution {
    public boolean isVowel(char c, Set<Character> vowels) {
        return vowels.contains(c) || vowels.contains((char)((int)c - 32));
    }

    public boolean halvesAreAlike(String s) {

        Set<Character> vowels = new HashSet<>();

        vowels.add('A'); vowels.add('E');
        vowels.add('I'); vowels.add('O');
        vowels.add('U');

        int n = s.length(), freq = 0; char c = 0;

        for (int i = 0; i < n; i++) {
            c = s.charAt(i);
            if (i < n/2 && isVowel(c, vowels)) {
                freq++;
            } else if (i >= n/2 && isVowel(c, vowels)) {
                freq--;
            }
        }

        return freq == 0;
    }
}
