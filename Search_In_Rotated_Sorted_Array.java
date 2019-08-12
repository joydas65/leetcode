class Solution {
    //static bool found = false;
    static int ans = -1;
    public static void binSearch(int[] nums, int target, int lb, int ub){
        int mid = lb + (ub - lb)/2;
        if(ans != -1)
            return;
        if(lb > ub)
            return;
        if(nums[mid]==target){
            ans = mid;
            return;
        }
        binSearch(nums, target, lb, mid - 1);
        binSearch(nums, target, mid + 1, ub);
    }
    public int search(int[] nums, int target){
        //found = false;
        ans = -1;
        binSearch(nums, target, 0, nums.length-1);
        return ans;
    }
}
