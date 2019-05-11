class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        
        if strs == []:
            
            return ""
        
        if len(strs) == 1:
            
            return strs[0]
        
        ind = 1
        
        n = len(strs)
        
        word,temp = "",""
        
        x,y = strs[0],strs[1]
        
        a,b,c,d = 0,0,len(x),len(y)
        
        if c > 0 and d > 0:
            
                while a < c and b < d and x[a] == y[b]:
                    
                    temp += x[a]
                    
                    a += 1

                    b += 1
                    
        if temp == "":
            
            return ""
        
        else:
            
            word = temp
            
            ind = 2
        
            while ind < n:

                x,y = word,strs[ind]
                
                a,b,c,d = 0,0,len(x),len(y)
                
                temp = ""

                if c > 0 and d > 0:

                    while a < c and b < d and x[a] == y[b]:

                        temp += x[a]
                        
                        a += 1

                        b += 1
                        
                    word = temp
                        
                ind += 1
                
            return temp
                    
            
                    
                    
                
                
        
