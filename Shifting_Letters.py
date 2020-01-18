class Solution:
    def shiftingLetters(self, S: str, shifts: List[int]) -> str:
        
        n = len(shifts)
        
        shifts[-1] %= 26
        
        for i in range(n-2,-1,-1):
            
            shifts[i] = (shifts[i+1] + shifts[i])%26
            
        i,ans,f = 0,"",0
        
        while i < n:
            
            c = ord(S[f]) + shifts[i]
            
            if c > 122:
                
                c -= 26
                
            ans += chr(c)
            
            i += 1
            
            f += 1
            
        return ans
