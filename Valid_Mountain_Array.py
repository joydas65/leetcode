class Solution:
    def validMountainArray(self, A: List[int]) -> bool:
        
        n,f,up = len(A),0,0
        
        for i in range(1,n):
            
            if A[i] == A[i-1]:
                
                return False
            
            elif A[i] > A[i-1]:
                
                up = 1
                
                if f == 1:
                    
                    return False
                
            elif A[i] < A[i-1]:
                
                f = 1
                
        return True if up == 1 and f == 1 else False
