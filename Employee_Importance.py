"""
# Employee info
class Employee:
    def __init__(self, id: int, importance: int, subordinates: List[int]):
        # It's the unique id of each node.
        # unique id of this employee
        self.id = id
        # the importance value of this employee
        self.importance = importance
        # the id of direct subordinates
        self.subordinates = subordinates
"""
class Solution:
    def getImportance(self, employees: List['Employee'], id: int) -> int:
        ans = 0
        
        for i in employees:
            
            if i.id == id:
                
                ans += i.importance
                
                break
                
        arr,seen = set(i.subordinates),set()
        seen.add(i.id)
        
        while True:
            
            flag = 0
        
            for i in employees:

                if i.id in arr and i.id not in seen:

                    ans += i.importance

                    arr = list(arr)

                    arr += i.subordinates

                    arr = set(arr)

                    seen.add(i.id)
                    
                    flag = 1
                    
            if flag == 0:
                break
                
        return ans
