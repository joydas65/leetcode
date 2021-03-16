class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        
        int first = 0, second = 0;
        
        for(int item : nums){
            if(!d.containsKey(item))
                d.put(item, 1);
            else{
                d.put(item, d.get(item) + 1);
                first = item;
            }
        }
        
        for(int i = 1; i <= nums.length; i++){
            if(!d.containsKey(i)){
                second = i; 
                break;
            }
        }
        
        int ans[] = {first, second};
        return ans;
    }
}
