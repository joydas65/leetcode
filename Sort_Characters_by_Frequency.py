class Solution:
    def frequencySort(self, s: str) -> str:
        d = dict()

        for i in s:

            if i in d:

                d[i] += 1

            else:

                d[i] = 1

        ar = sorted(d, key = lambda x : d[x], reverse = True)

        ans = ""

        for i in ar:

            ans = ans + str(i)*d[i]

        return ans
        
