class Solution:
    def titleToNumber(self, s: str) -> int:
        n,ans,x = len(s),0,0
        
        for i in range(n-1,-1,-1):
            
            ans += (26 ** x) * (ord(s[i]) - 64)
            x += 1
        return ans
