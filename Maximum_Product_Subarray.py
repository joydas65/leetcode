class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        
        n = len(nums)
        
        if n == 0:
            
            return 1
        
        if n == 1:
            
            return nums[0]
        
        currentMax,currentMin,totalMax = nums[0],nums[0],nums[0]
        
        for i in range(1,n):
            
            temp = currentMax
            
            currentMax = max(currentMax * nums[i], currentMin * nums[i], nums[i])
            
            currentMin = min(temp * nums[i], currentMin * nums[i], nums[i])
            
            if currentMax > totalMax:
                
                totalMax = currentMax
                
        return totalMax
