class Solution:
    def multiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        if num1 == "0" or num2 == "0":
            return "0"
        else:
            k = 0
            
            n1 = 0
            
            n2 = 0
            
            for i in num1:
                n1 = (n1 * 10) + (ord(i) - 48)
            for i in num2:
                n2 = (n2 * 10) + (ord(i) - 48)
            return str(n1*n2)
                
                
        
