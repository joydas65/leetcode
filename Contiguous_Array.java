class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        d.put(0, -1);
        int ans=0,c=0,index=0;
        for(int item : nums){
            c = item == 1 ? c+1 : c-1;
            
            if(d.containsKey(c)){
                ans = Math.max(ans, index - d.get(c));
            }else{
                d.put(c, index);
            }
            index += 1;
        }
        return ans;
    }
}
