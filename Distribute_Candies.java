class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> seen = new HashSet<Integer>();
        
        int c = 0;
        
        int n = candyType.length;
        
        for(int candy : candyType){
            if(!seen.contains(candy)){
                seen.add(candy);
                c++;
                if(c == n/2)
                    break;
            }
        }
        
        return c;
    }
}
