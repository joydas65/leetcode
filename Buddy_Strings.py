class Solution:
    def buddyStrings(self, A: str, B: str) -> bool:
        
        if A == "" or B == "":
            
            return False
        
        n1,n2,s = len(A),len(B),set()
        
        if n1 != n2:
            
            return False
        
        for i,j in enumerate(A):
            
            if B[i] != j:
                
                c,x = B[i],i+1
                
                while x < n1 and A[x] != c:
                    
                    x += 1
                    
                if x >= n1:
                    
                    return False
                    
                if (A[:i] + str(A[x]) + A[i+1:x] + str(j) + A[x+1:]) == B:
                    
                    return True
                
                return False
            
            s.add(j)
            
        if len(s) < n1:
            
            return True
        
        return False
