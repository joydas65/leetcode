class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int k = col-1,temp = 0;
        
        for(int i = 0; i < row; i++){
            k = col - 1;
            for(int j = 0; j < col/2; j++){
                temp = A[i][k];
                A[i][k] = A[i][j] == 0 ? 1 : 0;
                A[i][j] = temp == 0 ? 1 : 0;
                k--;
            }
            
            if(col % 2 == 1){
                A[i][col/2] = A[i][col/2] == 0 ? 1 : 0;
            }
        }
        
        return A;
    }
}
