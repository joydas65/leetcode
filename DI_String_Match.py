class Solution:
    def diStringMatch(self, S: str) -> List[int]:
        
        if S == "":
            
            return []
        
        n,ans = len(S),[]
        
        i,d = 0,n
        
        if S[0] == 'I':
            
            ans.append(i)
            i += 1
            
        elif S[0] == 'D':
            
            ans.append(d)
            d -= 1
            
        for j in range(1,n):
            
            if S[j-1] == 'D' and S[j] == 'D':
                
                ans.append(d)
                d -= 1
                
            elif S[j-1] == 'D' and S[j] == 'I':
                
                ans.append(i)
                i += 1
                
            elif S[j-1] == 'I' and S[j] == 'I':
                ans.append(i)
                i += 1
                
            elif S[j-1] == 'I' and S[j] == 'D':
                
                ans.append(d)
                d -= 1
                
        if S[-1] == 'D':
            ans.append(i)
            
        elif S[-1] == 'I':
            
            ans.append(d)
                
        return ans
