class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for(int item : arr){
            if(dict.containsKey(item)){
                dict.put(item, dict.get(item) + 1);
            }else{
                dict.put(item, 1);
            }
        }
        int ans = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : dict.entrySet()){
            int key = (int)entry.getKey();
            int val = (int)entry.getValue();
            if(key == val){
                ans = Math.max(ans, key);
            }
        }
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}
