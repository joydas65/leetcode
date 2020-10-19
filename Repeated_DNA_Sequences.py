class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        
        n,seen,i,ans = len(s),dict(),0,[]
        
        while i+10 <= n:
            
            temp = s[i:i+10]
            
            if temp in seen:
                
                seen[temp] += 1
                
                if seen[temp] == 2:
                
                    ans.append(temp)
                    
            else:
                
                seen[temp] = 1
            
            i += 1
            
        return ans
