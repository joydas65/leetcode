class Solution {
    public int removeDuplicates(int[] nums){
        int i=1,k=1;
        while(i < nums.length){
            while(i < nums.length && nums[i] == nums[i-1]){
                i += 1;
            }
            if(i < nums.length){
                nums[k++] = nums[i];
            }
            i += 1;
        }
        return k;
    }
}
