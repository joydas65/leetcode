class Solution:
    def freqAlphabets(self, s: str) -> str:
        
        pos,n = [],len(s)
        
        for i,j in enumerate(s):
            
            if j == '#':
                pos.append(i-2)
                pos.append(i-1)
                pos.append(i)
                
        x,ans,w,i = 0,"",len(pos),0
        
        while i < n:
            
            if x < w and pos[x] == i:
                
                ans += chr(int(str(s[pos[x]])+str(s[pos[x+1]]))+96)
                x += 3
                i += 3
            else:
                
                ans += chr((ord(s[i])-48)+96)
                i += 1
                
        return ans
