class Solution:
    def buddyStrings(self, A: str, B: str) -> bool:
        
        if A == "" or B == "":
            return False
        
        n1,n2 = len(A),len(B)
        
        if n1 != n2:
            return False
        
        if n1 == 2:
            
            if A[0] == B[1] and A[1] == B[0]:
                return True
            return False
        
        changes,change = 0,[]
        
        for i,j in enumerate(A):
            
            if j != B[i]:
                
                changes += 1
                if changes > 2:
                    break
                change.append(i)
                
        if changes > 2:
            
            return False
        
        elif changes == 0:
            
            d = dict()
            
            for i in A:
                
                if i in d:
                    
                    d[i] += 1
                    
                    if d[i] >= 2:
                        return True
                    
                else:
                    d[i] = 1
                    
            return False
        return True if (A[change[0]] == B[change[1]] and A[change[1]] == B[change[0]]) else False
