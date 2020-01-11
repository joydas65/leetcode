class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        
        if target <= nums[0]:
            return 0
        
        if target > nums[-1]:
            return len(nums)
        
        if target == nums[-1]:
            return len(nums)-1
        
        lb,ub = 0,len(nums)-1
        
        while lb <= ub:
            
            mid = (lb + ub)//2
            
            if nums[mid] == target:
                
                return mid
                
            elif nums[mid] < target:
                
                lb = mid + 1
                
            else:
                
                ub = mid - 1
                
        return lb
