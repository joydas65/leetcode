class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        
        if digits[-1] >= 0 and digits[-1] <= 8:
            
            digits[-1] += 1
            
            return digits
        
        else:
            
            digits[-1] = 0
            
            i = len(digits) - 2
            
            while i >= 0:
                
                if digits[i] >= 0 and digits[i] <= 8:
                    
                    digits[i] += 1
                    
                    break
                    
                else:
                    
                    digits[i] = 0
                    
                    i -= 1
                    
            if i == -1:
                    
                return [1] + digits
            
            return digits
        
        
        
