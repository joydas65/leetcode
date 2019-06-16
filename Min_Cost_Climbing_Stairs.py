class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        
        cost.append(0)
        
        dp = []
        
        dp.append(cost[0])
        dp.append(cost[1])
        
        for i in range(2,len(cost)):
            
            dp.append(min(dp[i-2]+dp[i-1]+cost[i],dp[i-2]+cost[i],dp[i-1]+cost[i]))
            
        return dp[-1]
        
