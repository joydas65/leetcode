class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        
        arr,ind,n = [],0,len(A)
        
        for i,j in enumerate(A):
            
            if j >= 0:
                ind = i
                break
                
        h = ind - 1
                
        while ind < n and h >= 0:
            
            v1,v2 = A[ind],A[h]
            
            if v1*v1 < v2*v2:
                
                arr.append(v1*v1)
                ind += 1
                
            elif v1*v1 > v2*v2:
                
                arr.append(v2*v2)
                h -= 1
                
            else:
                
                arr.append(v1*v1)
                arr.append(v2*v2)
                ind += 1
                h -= 1
                
        if ind == n:
            
            while h >= 0:
                
                arr.append(A[h]*A[h])
                h -= 1
                
        elif h < 0:
            
            while ind < n:
                
                arr.append(A[ind]*A[ind])
                ind += 1
                
        return arr
        
