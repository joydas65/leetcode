class Solution {
    public int[] productExceptSelf(int[] nums) {
        int forward[] = new int[nums.length];
        int backward[] = new int[nums.length];
        forward[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            forward[i] = forward[i-1]*nums[i];
        }
        backward[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            backward[i] = backward[i+1]*nums[i];
        }
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0)
                ans[i] = backward[1];
            else if(i == nums.length - 1)
                ans[i] = forward[i-1];
            else
                ans[i] = (forward[i-1]*backward[i+1]);
        }
        return ans;
    }
}
