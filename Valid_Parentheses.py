class Solution:
    def isValid(self, s: str) -> bool:
        
        d = {')':'(','}':'{',']':'['}
        
        open_brace = ['(','{','[']
        
        close_brace = [']','}',')']
        
        st = []
        
        for i in s:
            
            if i in open_brace:
                
                st.append(i)
                
            else:
                
                if st == [] or d[i] != st[-1]:
                    
                    return False
                
                else:
                    
                    st.pop()
                    
        return True if st == [] else False
        
