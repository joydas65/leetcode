import sys

class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        
        if len(nums) < 3:
            
            return 0
        
        if len(nums) == 3:
            
            return sum(nums)
        
        nums = sorted(nums)
        
        d = dict()
        
        for i in range(len(nums)-2):
            
            j = i + 1
            k = len(nums) - 1
            
            while j < k:
                if nums[i] + nums[j] + nums[k] == target:
                    d[nums[i]+nums[j]+nums[k]] = 0
                    j += 1
                    k -= 1
                elif nums[i] + nums[j] + nums[k] > target:
                    d[nums[i]+nums[j]+nums[k]] = abs(nums[i]+nums[j]+nums[k] - target)
                    k -= 1
                else:
                    d[nums[i]+nums[j]+nums[k]] = abs(target - nums[i]-nums[j]-nums[k])
                    j += 1
                    
        val = sys.maxsize
                    
        for i in d:
            
            val = min(val, d[i])
            
        for i in d:
            
            if d[i] == val:
                
                return i
        '''return min(res)'''
        
        
        
