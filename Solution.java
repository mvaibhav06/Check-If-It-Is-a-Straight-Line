class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        double m = 0;
        if(x2-x1 != 0){
            m = (double) (y2-y1)/(x2-x1);
        }else{
            int a = coordinates[0][0];
            for(int i=1; i<coordinates.length; i++){
                if(coordinates[i][0] != a){
                    return false;
                }
            }
            return true;
        }
        double c = y1 - (m*x1);

        for(int i=0; i<coordinates.length; i++){
            double k = (m*coordinates[i][0])+c;
            if(k != coordinates[i][1]){
                return false;
            }
        }
        return true;
    }
}
