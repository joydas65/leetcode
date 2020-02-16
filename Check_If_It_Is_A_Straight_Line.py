class Solution:
    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        
        n = len(coordinates)
        
        dy = coordinates[1][1] - coordinates[0][1]
        dx = coordinates[1][0] - coordinates[0][0]
        
        if dx == 0:
            return False
        
        slope = dy/dx
        
        for i in range(2,n):
            
            dy = coordinates[i][1] - coordinates[i-1][1]
            
            dx = coordinates[i][0] - coordinates[i-1][0]
            
            if dx == 0:
                
                return False
            
            if slope != (dy/dx):
                
                return False
            
            slope = dy/dx
            
        return True
