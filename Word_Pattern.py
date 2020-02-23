class Solution:
    def wordPattern(self, pattern: str, sentence: str) -> bool:
        arr = sentence.split(' ')
        
        if len(pattern) != len(arr):
            return False
        
        d,j,seen = dict(),0,set()
        
        for i in pattern:
            
            if i not in d:
                
                if arr[j] not in seen:
                
                    d[i] = arr[j]
                    seen.add(arr[j])
                    
                else:
                    return False
                
            else:
                
                if arr[j] != d[i]:
                    return False
                
            j += 1
            
        return True
