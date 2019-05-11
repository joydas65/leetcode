class Solution:
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        minus = 0
        num = 0
        f1 = 0
        f2 = 0
        if str == "":
            return 0
        for i in str:
            if i == ' ':
                if f1 == 1:
                    break
                elif f2 == 1:
                    return 0
                continue
            elif i != ' ' and (i == '-' or i == '+'):
                if i == '-':
                    minus = 1
                if f1 == 1:
                    return -num if f2 == 1 else num
                if f2 == 1:
                    return 0
                f2 = 1
            elif i != ' ' and not (i >= '0' and i <= '9'):
                if f1 == 0 and f2 == 0:
                    return 0
                else:
                    break
            elif i != ' ' and i >= '0' and i <= '9':
                num = (num*10) + int(i)
                f1 = 1
        if minus == 1 and (-1)*num < -2147483648:
            return -2147483648
        if minus == 0 and num >= 2147483647:
            return 2147483647
        return (-1)*num if minus == 1 else num
                
        
                
                
        
