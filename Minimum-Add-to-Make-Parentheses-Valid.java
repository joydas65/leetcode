class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, close = 0, ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            else {
                if (open > 0) open--;
                else close++;
            }

            if (close > open) { ans++; close--; }
        }

        return ans + open;
    }
}
