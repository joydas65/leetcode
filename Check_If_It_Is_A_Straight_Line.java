class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2)
            return true;
        float x = coordinates[1][0] - coordinates[0][0];
        float y = coordinates[1][1] - coordinates[0][1];
        float slope = y/x;
        float b = coordinates[0][1] - (slope * coordinates[0][0]);
        for(int i = 2; i < coordinates.length; i++){
            
            float Y = coordinates[i][1];
            
            float X = coordinates[i][0];
            
            float MX = slope * X;
            
            if(Y != (MX + b))
                return false;
        }
        
        return true;
    }
}
