class Solution:
    def convertToTitle(self, n: int) -> str:
        if n <= 26:
            return str(chr(n+64))
        ans = ""
        while n > 26:
            
            d = n % 26
            
            if d == 0:
                
                ans = "Z" + ans
                
                n //= 26
                n -= 1
                
            else:
            
                ans = str(chr(d+64)) + ans
            
                n //= 26
            
        return str(chr(n+64)) + ans
