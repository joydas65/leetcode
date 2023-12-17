class Solution {
    public int removeDuplicates(int[] nums) {
        int freq = 1, j = 1, i = 1, n = nums.length;
        while (i < n) {
            if (nums[i] != nums[i-1]) nums[j++] = nums[i];
            i++;
        }

        return j;
    }
}
