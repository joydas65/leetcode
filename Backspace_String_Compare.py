class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        
        ar1,ar2,x,y=[],[],0,0
        
        for i in S:
            
            if i == '#':
                
                if x > 0:
                    
                    ar1.pop()
                    
                    x -= 1
                    
            else:
                
                ar1.append(i)
                x += 1
                
        for i in T:
            
            if i == '#':
                
                if y > 0:
                    
                    ar2.pop()
                    
                    y -= 1
                    
            else:
                
                ar2.append(i)
                
                y += 1
                
        return True if ar1 == ar2 else False
        
        
