class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        if matrix == []:
            
            return False
        
        rows,cols = len(matrix),len(matrix[0])
        
        lb,ub = 0,(rows*cols)-1
        
        while lb <= ub:
            
            mid = (lb + ub)//2
            
            r,c = mid//cols,mid%cols
            
            if matrix[r][c] == target:
                
                return True
            
            elif matrix[r][c] < target:
                
                lb = mid + 1
                
            else:
                
                ub = mid - 1
                
        return False
