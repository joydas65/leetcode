import java.util.*;
class Solution {
    public int minMoves2(int[] nums){
        //int n = nums.length;
        Arrays.sort(nums);
        int element = nums[nums.length/2];
        int ans=0;
        for(int i = 0; i < nums.length; i++){
            if(i != nums.length/2)
                ans += Math.abs(nums[i]-element);
        }
        return ans;
    }
}
