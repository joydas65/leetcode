class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        
        x,d = set(),dict()
        
        for i in arr:
            
            if i in d:
                
                d[i] += 1
                
            else:
                
                d[i] = 1
                
        for i in d:
            
            if d[i] in x:
                
                return False
            
            x.add(d[i])
            
        return True
