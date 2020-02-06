package Code_01_arrayProblem;

public class Code_1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points==null||points.length<=0)
            return 0;
        int res=0;
        for(int i=0;i<points.length-1;i++){
            res+=(Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1])));
        }
        return res;
    }
}
