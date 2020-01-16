class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        
        n,i,x = len(s),0,""
        
        while i < (n//2):
            
            x += s[i]
            
            if x*(n//(i+1)) == s:
                return True
            
            i += 1
            
        return False
