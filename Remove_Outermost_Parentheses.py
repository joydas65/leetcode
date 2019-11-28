class Solution:
    def removeOuterParentheses(self, S: str) -> str:
        
        n,top,ans = len(S),0,""
        
        for i in range(1,n):
            
            if top >= 0 and S[i] == '(':
                
                ans += S[i]
                top += 1
                
            elif top >= 0 and S[i] == ')':
                
                top -= 1
                
                if top >= 0:
                    
                    ans += S[i]
                    
            elif top == -1 and S[i] == '(':
                
                top = 0
                
        return ans
