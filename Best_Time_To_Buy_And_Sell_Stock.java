class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0)
            return 0;
        int greater[] = new int[prices.length];
        int i;
        greater[n-1] = prices[n-1];
        for(i=n-2;i>=0;i--){
            greater[i] = Math.max(greater[i+1], prices[i+1]);
        }
        int ans = 0;
        for(i=0;i<n;i++){
            ans = Math.max(ans, greater[i]-prices[i]);
        }
        return ans;
    }
}
