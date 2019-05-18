class Solution {
    public int repeatedNTimes(int[] A){
        Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
        int i;
        for(i=0; i < A.length; i++){
            if(dic.containsKey(A[i])){
                break;
            }else{
                dic.put(A[i], 1);
            }
        }
        return A[i];
    }
}
