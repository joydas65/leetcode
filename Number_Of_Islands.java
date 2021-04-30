class Solution {
    int visited[][];
    
    public boolean valid(int r, int R, int c, int C) {
        return (r >= 0 && r < R && c >= 0 && c < C) ? true : false;
    }
    
    public void bfs(char[][] grid, int row, int col, int r, int c) {
        visited[r][c] = 1;
        
        if (valid(r-1,row,c,col) && visited[r-1][c] == 0 && grid[r-1][c] == '1') {
            bfs(grid, row, col, r-1, c);
        }
        
        if (valid(r+1,row,c,col) && visited[r+1][c] == 0 && grid[r+1][c] == '1') {
            bfs(grid, row, col, r+1, c);
        }
        
        if (valid(r,row,c-1,col) && visited[r][c-1] == 0 && grid[r][c-1] == '1') {
            bfs(grid, row, col, r, c-1);
        }
        
        if (valid(r,row,c+1,col) && visited[r][c+1] == 0 && grid[r][c+1] == '1') {
            bfs(grid, row, col, r, c+1);
        }
    }
    
    public int compute(char[][] grid, int row, int col) {
        int ans = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (visited[i][j] == 0 && grid[i][j] == '1') {
                    ans += 1;
                    bfs(grid, row, col, i, j);
                }
            }
        }
        
        return ans;
    }
    
    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        visited = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = 0;
            }
        }
        
        return compute(grid, n, m);
    }
}
