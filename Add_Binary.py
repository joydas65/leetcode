class Solution:
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        
        a = a[::-1]
        
        b = b[::-1]

        c = 0
        i = 0
        j = 0

        result = ""

        while i < len(a) and j < len(b):

            result += str((c + int(a[i]) + int(b[j])) % 2)

            if c + int(a[i]) + int(b[j]) >= 2:

                c = 1

            else:

                c = 0

            i += 1

            j += 1

        if i < len(a) and j == len(b):

            while i < len(a):

                result += str((c + int(a[i])) % 2)

                if c + int(a[i]) >= 2:

                    c = 1

                else:

                    c = 0

                i += 1

        elif i == len(a) and j < len(b):

            while j < len(b):

                result += str((c + int(b[j])) % 2)

                if c + int(b[j]) >= 2:

                    c = 1

                else:

                    c = 0

                j += 1

        if c == 1:

            result += "1"

        return result[::-1]
