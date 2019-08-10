class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        if k < 0:
            
            return 0
        
        x,f,p = set(),0,set()
        
        for i in nums:
            
            if i in x and i not in p:
                
                f += 1
                
                p.add(i)
            
            x.add(i)
            
        if k == 0:
            
            return f
            
        r,ans = set(),0
            
        for i in nums:
            
            if i-k in x and (i-k,i) not in r:
                
                ans += 1
                
                r.add((i-k,i))
                r.add(i)
                
            if i+k in x and (i,i+k) not in r:
                
                ans += 1
                
                r.add((i,i+k))
                r.add(i)
                
        #print(r)
                
        return ans
                
                
        
