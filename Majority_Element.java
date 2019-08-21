class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count=1,candidate = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
                count = 1;
            }else{
                if(candidate == nums[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }
        count = 0;
        for(int i = 0; i < nums.length; i++){
            if(candidate == nums[i])
                count++;
        }
        if(count > n/2)
            return candidate;
        return nums[0];
    }
}
