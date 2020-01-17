class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        
        x = set()
        
        for i in arr2:
            x.add(i)
            
        not_in_arr2,d = [],dict()
        
        for i in arr1:
            
            if i in d:
                
                d[i] += 1
                
            else:
                
                d[i] = 1
            
            if i not in x:
                
                not_in_arr2.append(i)
                
        not_in_arr2 = sorted(not_in_arr2)
        
        ans = []
        
        for i in arr2:
            
            for j in range(d[i]):
                
                ans.append(i)
                
        for i in not_in_arr2:
            
            ans.append(i)
            
        return ans
