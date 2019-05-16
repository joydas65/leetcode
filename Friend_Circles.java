class Solution{
    static boolean visited[] = new boolean[200];
    static int dfs(int[][] M, int source){
        int tos=-1;
        visited[source] = true;
        int st[] = new int[M.length];
        st[++tos] = source;
        boolean change = false;
        int i,j;
        while(tos >= 0){
            change = false;
            i = st[tos];
            for(j=0;j<M.length;j++){
                if(!visited[j]&&M[i][j] == 1){
                    st[++tos] = j;
                    visited[j] = true;
                    change = true;
                    break;
                }
            }
            if(change == false)
                tos--;
        }
        return 1;
    }
    public int findCircleNum(int[][] M){
        int ans = 0;
        for(int i=0;i<M.length;i++){
            visited[i] = false;
        }
        for(int i=0;i<M.length;i++){
            if(!visited[i]){
                ans += dfs(M, i);
            }
        }
        return ans;
    }
}
