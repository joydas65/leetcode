class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        
        if(n <= 2)
            return false;
        
        if(n == 3){
            if(nums[0] < nums[2] && nums[2] < nums[1])
                return true;
            return false;
        }
        
        Stack<Integer> st = new Stack<Integer>();
        
        int mini[] = new int[n];
        
        mini[0] = nums[0];
        
        for(int i = 1; i < n; i++){
            mini[i] = Math.min(mini[i-1], nums[i]);
        }
        
        for(int j = n-1; j >= 0; j--){
            if(nums[j] > mini[j]){
                while(!st.isEmpty() && st.peek() <= mini[j]){
                    st.pop();
                }
                
                if(!st.isEmpty() && st.peek() < nums[j])
                    return true;
                
                st.push(nums[j]);
            }
        }
        
        return false;
    }
}
