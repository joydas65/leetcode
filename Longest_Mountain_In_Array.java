class Solution {
    public int longestMountain(int[] A) {
        int n = A.length;
        
        if(n <= 2)
            return 0;
        
        if(n == 3){
            if(A[0] < A[1] && A[1] > A[2])
                return 3;
            return 0;
        }
        
        int prev = -1,flag = 0,c = 0,ans = 0;
        
        for(int item : A){
            if(prev == item || (flag == 1 && prev < item)){
                if(c >= 3)
                    ans = Math.max(ans, c);
                if(prev == item)
                    c = 1;
                else
                    c = 2;
                flag = 0;
            }
            else if(flag == 0 && prev > item && prev != -1){
                flag = 1;
                if(c == 1){
                    c = 1;
                    flag = 0;
                }else{
                    c++;
                }
            }else if(prev != item){
                c++;
            }
            
            prev = item;
        }
        
        return flag == 0 ? ans : Math.max(ans, c);
    }
}
