from itertools import permutations 
class Solution:
    def largestTimeFromDigits(self, A: List[int]) -> str:
        perm,v1,v2,ans,flag = permutations(A),0,0,0,0
        
        for i in list(perm):
            
            v1 = int(str(i[0])+str(i[1]))
            v2 = int(str(i[2])+str(i[3]))
            
            if v1 >= 0 and v1 <= 23 and v2 >= 0 and v2 <= 59:
                flag = 1
                v = 0
                
                v = (10*v) + i[0]
                v = (10*v) + i[1]
                v = (10*v) + i[2]
                v = (10*v) + i[3]
                
                ans = max(ans, v)
                
        if flag == 0:
            return ""
                
        time = str(ans)
        n = len(time)
        
        if n == 4:
            return time[0]+time[1]+":"+time[2]+time[3]
        
        elif n == 3:
            
            return "0" + time[0] + ":" + time[1] + time[2]
        
        elif n == 2:
            
            return "00:"+time[0] + time[1]
        
        elif n == 1:
            
            return "00:0"+time[0]
        
        else:
            return "00:00" 
