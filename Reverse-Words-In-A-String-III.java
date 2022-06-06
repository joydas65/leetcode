class Solution {
    public String reverseWords(String s) {
        char c = 0;
        
        StringBuilder sb = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");
        
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            
            if (c == ' ') {
                ans.append(sb.reverse());
                ans.append(" ");
                sb = new StringBuilder("");
            } else {
                sb.append(s.charAt(i));
            }
        }
        
        ans.append(sb.reverse());
        
        return ans.toString();
    }
}
