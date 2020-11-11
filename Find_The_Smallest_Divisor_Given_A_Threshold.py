import sys

class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        
        m = max(nums)
        
        lb,ub,ans = 1,m,sys.maxsize
        
        while lb <= ub:
            
            mid = (lb + ub)//2
            
            s = 0
            
            for item in nums:
                
                if item % mid == 0:
                    
                    s += (item//mid)
                    
                else:
                    
                    s += (item//mid) + 1
                    
                if s > threshold:
                    
                    break
                    
            if s > threshold:
                
                lb = mid + 1
                
            else:
                
                if ans > mid:
                    
                    ans = mid
                
                ub = mid - 1
                
        return ans
