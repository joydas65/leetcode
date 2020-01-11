class Solution:
    def minDeletionSize(self, A: List[str]) -> int:
        
        n = len(A)
        
        if n == 0 or n == 1:
            
            return 0
        
        n = len(A[0])
        
        ind,ans = 0,0
        
        while ind < n:
            
            f,flag = 32,0
        
            for word in A:
            
                if f > ord(word[ind]):
                    
                    flag = 1
                    break
                    
                f = ord(word[ind])
            if flag == 1:
                ans += 1
                
            ind += 1
            
        return ans
