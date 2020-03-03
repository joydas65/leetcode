class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        arr,i = [[1]],1
        
        while i <= 33:
            
            n,st = len(arr[-1]),[]
            
            for j,k in enumerate(arr[-1]):
                
                if j == 0:
                    
                    st.append(arr[-1][0])
                    
                if j >= 1:
                    
                    st.append(k + arr[-1][j-1])
                    
                if j == n-1:
                    
                    st.append(arr[-1][-1])
            arr.append(st)
            
            i += 1
            
        #print(arr)
            
        return arr[rowIndex]
