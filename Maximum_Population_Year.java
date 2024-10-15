class Solution {
    public int maximumPopulation(int[][] logs) {
        int n = logs.length;
        if (n == 1) {
            return logs[0][0];
        }

        int year = 1950, i = 0, ans = Integer.MAX_VALUE, maxPopulation = 0, count = 0;

        while (year <= 2050) {
            while (i < n) {
                if (logs[i][0] <= year && year <= logs[i][1]-1) count++;
                i++;
            }
            if (maxPopulation < count) {
                maxPopulation = count; ans = year;
            }
            i = 0;
            year++; count=0;
        }

        return ans;
    }
}
