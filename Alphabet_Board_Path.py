class Solution:
    def alphabetBoardPath(self, target: str) -> str:
        
        #R,C = 6,5
        
        d,r,c = dict(),0,0
        
        for i in "abcdefghijklmnopqrstuvwxyz":
            
            d[i] = (r,c)
            
            c += 1
            
            if c == 5:
                
                c = 0
                
                r += 1
                
        #print(d)
        r,c,ans = 0,0,""
        
        for i in target:
            
            row,col = d[i][0],d[i][1]
            
            if row == 5 and col == 0:
                
                if c == 0:
                    
                    ans += ("D" * (row - r))
                    
                else:
                    
                    ans += (("D" * (row - r - 1)) + ("L" * c) + "D")
                    
            else:
            
                if row > r:

                    ans = ans + ("D" * (row - r))

                elif row < r:

                    ans = ans + ("U" * (r - row))

                if col > c:

                    ans = ans + ("R" * (col - c))

                elif col < c:

                    ans = ans + ("L" * (c - col))
                
            ans += "!"
            
            r,c = row,col
            
        return ans
