class Solution:
    
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        def checkSquare(board, row, col):
        
            x = set()

            for i in range(row, row + 3):

                for j in range(col, col + 3):
                    
                    if board[i][j] == ".":
                        
                        continue

                    if board[i][j] in x:

                        return False

                    x.add(board[i][j])

            return True
        
        i,j = 0,0
        
        while i < 9:
            
            while j < 9:
                
                if checkSquare(board, i, j) == False:
                    
                    return False
                
                j += 3
                
            i += 3
            
            j = 0
            
        i,j,v = 0,0,set()
        
        while i < 9:
            
            while j < 9:
                
                if board[i][j] == ".":
                    
                    j += 1
                    
                    continue
                
                if board[i][j] in v:
                    
                    return False
                
                v.add(board[i][j])
                
                j += 1
                
            j = 0
            
            i += 1
            
            v = set()
            
        i,j,v = 0,0,set()
            
        while i < 9:
            
            while j < 9:
                
                if board[j][i] == ".":
                    
                    j += 1
                    
                    continue
                
                if board[j][i] in v:
                    
                    return False
                
                v.add(board[j][i])
                
                j += 1
                
            j = 0
            
            i += 1
            
            v = set()
            
        return True
            
        
                
                
        
