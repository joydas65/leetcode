import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k){
        int c=0,sum=0;
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        d.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(d.containsKey(sum-k)){
                c += d.get(sum-k);
            }
            if(d.containsKey(sum)){
                d.put(sum, d.get(sum)+1);
            }else{
                d.put(sum, 1);
            }
        }
        return c;
    }
}
