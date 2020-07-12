import java.text.DecimalFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        new Solution().getMinDistSum(new int[][]{{1,1},{0,0},{2,0}});
    }
    public double getMinDistSum(int[][] positions) {
        if(positions==null||positions.length<=1)
            return 0;
        double avx=0;
        double avy=0;
        int totalx=0;
        int totaly=0;
        for(int i=0;i<positions.length;i++){
            totalx+=positions[i][0];
            totaly+=positions[i][1];
        }
        avx=totalx*1.0/(positions.length*1.0);
        avy=totaly*1.0/(positions.length*1.0);

        double res=0;
        for(int i=0;i<positions.length;i++){
            double disx=(positions[i][0]-avx)*(positions[i][0]-avx);
            double disy=(positions[i][1]-avy)*(positions[i][1]-avy);
            res+=Math.sqrt(disx+disy);
        }
        DecimalFormat df=new DecimalFormat("0.00000");
        return Double.valueOf(df.format(res)) ;

    }
}