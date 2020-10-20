class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        
        d,arr,taken = dict(),[],dict()
        
        for item in s:
            
            if item in d:
                
                d[item] += 1
                
            else:
                
                d[item] = 1
                
        for item in s:
            
            d[item] -= 1
            
            if arr == []:
                
                arr.append(item)
                
            elif item in taken and taken[item] == True:
                
                continue
                
            else:
                
                while arr != [] and ord(item) < ord(arr[-1]) and d[arr[-1]] > 0:
                    
                    taken[arr[-1]] = False
                    
                    arr.pop()
                    
                arr.append(item)
                
            taken[item] = True
            
        ans = ""
        
        for item in arr:
            
            ans += item
            
        return ans
