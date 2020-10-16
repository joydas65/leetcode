class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0)
            return;
        
        int n = nums.length;
        
        k = k % n;
        
        int j = n-1,i = 0,temp = 0;
        
        while(i < (n - k)/2){
            temp = nums[i];
            nums[i] = nums[n-k-i-1];
            nums[n-k-i-1] = temp;
            i++;
        }
        
        i = n-k;
        
        while(i < j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
        i = 0; j = n-1;
        
        while(i < n/2){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
