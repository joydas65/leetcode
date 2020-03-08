class Solution:
    def reverseBits(self, n: int) -> int:
        arr = []
        while n != 0:
            
            arr.append(n % 2)
            
            n //= 2
            
        for i in range(32-len(arr)):
            
            arr.append(0)
        #print(arr)
        p,ans = 31,0
        
        for i in arr:
            
            ans += ((2**p)*i)
            
            p -= 1
            
        return ans
