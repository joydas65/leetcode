class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int val,ind,i,j,even_sum=0,n=A.length;
        int arr[] = new int[n];
        int rows = queries.length;
        for(i = 0; i < n; i++){
            if(A[i]%2 == 0)
                even_sum += A[i];
        }
        //System.out.println(even_sum);
        for(i=0;i<rows;i++){
            ind = queries[i][1];
            if(Math.abs(A[ind])%2 == 1){
                A[ind] += queries[i][0];
                if(Math.abs(A[ind])%2 == 0)
                    even_sum += A[ind];
            }else{
                val = A[ind];
                A[ind] += queries[i][0];
                if(Math.abs(A[ind])%2 == 1)
                    even_sum -= val;
                else{
                    even_sum += (A[ind]-val);
                }
            }
            arr[i] = even_sum;
        }
        return arr;
    }
}
