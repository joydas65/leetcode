class Solution:
    def findUnsortedSubarray(self, nums: List[int]) -> int:
        
        arr = nums.copy()
        
        arr = sorted(arr)
        
        flag,start,end = 0,0,0
        
        for i in range(len(nums)):
            
            if nums[i] != arr[i] and flag == 0:
                
                start,flag = i,1
                
            elif nums[i] != arr[i] and flag == 1:
                
                end = i
                
        if start == 0 and end == 0:
            
            return 0
                
        return end-start+1
