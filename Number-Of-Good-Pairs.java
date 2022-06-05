import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        long total_ans = 0; int temp = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                temp = (int) entry.getValue();
                total_ans += (temp * (temp - 1)) / 2;
            }
        }
        
        return (int) total_ans;
    }
}
