class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        
        dig_log,let_log = [],[]
        
        for i in logs:
            
            arr = list(map(str, i.split()))
            
            try:
                
                k = int(arr[1])
                
                dig_log.append(i)
                
            except ValueError:
                
                x = ""
                
                for j in arr[1:-1]:
                    
                    x = x + j + " "
                    
                x += arr[-1]
                    
                let_log.append((x,arr[0]))
                
        let_log = sorted(let_log)
        
        ans = []
        
        for i in let_log:
            
            ans.append(i[1]+" "+i[0])
            
        for i in dig_log:
            
            ans.append(i)
        return ans
