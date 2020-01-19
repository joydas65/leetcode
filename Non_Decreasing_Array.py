class Solution:
    def checkPossibility(self, arr: List[int]) -> bool:
        
        change,n = 0,len(arr)
        
        for i in range(1,n):
            
            if arr[i-1] > arr[i]:
                
                if i-2 >= 0 and arr[i-2] <= arr[i]:
                    change += 1
                elif i-2 >= 0 and arr[i-2] > arr[i]:
                    change += 1
                    arr[i] = arr[i-1]
                else:
                    change += 1
                    
            if change >= 2:
                return False
        return True
