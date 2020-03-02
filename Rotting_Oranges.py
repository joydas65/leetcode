class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        
        n,m,ans = len(grid),len(grid[0]),0
        
        while True:
            
            flag,now_only = 0,set()
        
            for i in range(n):

                for j in range(m):
                    
                    if grid[i][j] in (0,1) or (i,j) in now_only:
                        continue

                    if grid[i][j] == 2:

                        if i+1 < n and grid[i+1][j] == 1:

                            grid[i+1][j] = 2
                            flag = 1
                            now_only.add((i+1,j))

                        if j+1 < m and grid[i][j+1] == 1:

                            grid[i][j+1] = 2
                            flag = 1
                            now_only.add((i,j+1))

                        if j-1 >= 0 and grid[i][j-1] == 1:

                            grid[i][j-1] = 2
                            flag = 1
                            now_only.add((i,j-1))

                        if i-1 >= 0 and grid[i-1][j] == 1:

                            grid[i-1][j] = 2
                            flag = 1
                            now_only.add((i-1,j))
                            
            #print(grid)
            #print(now_only)
                            
            if flag == 0:
                for i in grid:
                    for j in i:
                        if j == 1:
                            return -1
                break

            ans += 1
            
        return ans
