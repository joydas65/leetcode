class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length - 1;
        int points = 0, ans = 0;
        
        while(i <= j){
            if(P >= tokens[i]){
                P -= tokens[i++];
                points++;
                ans = Math.max(ans, points);
            }else if(points > 0){
                P += tokens[j--];
                points--;
            }else{
                return ans;
            }
        }
        
        return ans;
    }
}
