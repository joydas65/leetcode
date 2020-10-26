class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        
        def isColliding(a,b):
            
            if (a < 0 and b < 0) or (a > 0 and b > 0) or (a < 0 and b > 0):
                
                return False
            
            return True
        
        arr = []
        
        for item in asteroids:
            
            if arr == []:
                
                arr.append(item)
                
            else:
                
                if not isColliding(arr[-1],item):
                    
                    arr.append(item)
                    
                else:
                    
                    if abs(item) == abs(arr[-1]):
                        
                        arr.pop()
                        
                    else:
                        
                        f = False
                    
                        while arr != [] and arr[-1] > 0 and abs(item) == max(abs(arr[-1]),abs(item)):
                            
                            if abs(item) == abs(arr[-1]):
                                
                                f = True
                    
                            arr.pop()
                        
                            if f == True:
                                
                                break

                        if f == False and (arr == [] or (not isColliding(arr[-1],item))):
                            
                            arr.append(item)
                            
        return arr
