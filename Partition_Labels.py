class Solution:
    def partitionLabels(self, S: str) -> List[int]:
        
        d = dict()
        
        for i,j in enumerate(S):
            
            if j in d:
                
                d[j][1] = i
                
            else:
                
                d[j] = [i,i,0]
                
        ans = []
        
        #print(d)
                
        for i in S:
            
            if i in d and d[i][2] == 0:
                
                if ans == []:
                
                    ans.append(d[i][:2])
                    
                else:
                    
                    if d[i][0] > ans[-1][1]:
                        
                        ans.append(d[i][:2])
                        
                    else:
                        
                        ans[-1][0] = min(ans[-1][0], d[i][0])
                        
                        ans[-1][1] = max(ans[-1][1], d[i][1])
                        
                d[i][2] = 1
                        
        return [i[1] - i[0] + 1 for i in ans]
