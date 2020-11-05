class Solution:
    def maxPower(self, s: str) -> int:
        
        n,i,f,ans = len(s),0,1,0
        
        while i < (n-1):
            
            if s[i] != s[i+1]:
                
                ans = max(ans, f)
                
                f = 1
                
            else:
                
                f += 1
                
            i += 1
            
        return max(ans, f)
