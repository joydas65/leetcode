class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        
        if s == "":
            
            return s
        
        n = len(s)
        
        i = 0
        
        ans = ""
        
        while i < n:
            
            if n - i >= 2*k:
            
                ans += (s[i:i+k][::-1] + s[i+k:i+(2*k)]) 
                
            elif n - i >= k and n - i < (2*k):
                
                ans += (s[i:i+k][::-1] + s[i+k:])
                
            elif n - i < k:
                
                ans += s[i:][::-1]
            
            i += (2*k)
            
        return ans
