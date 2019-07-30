package Code_00_LeetCode_ShuaTi.Code_03_Greedy;

//https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/

import java.util.Arrays;
import java.util.Comparator;

public class Code_0452 {
    public int findMinArrowShots(int[][] points) {
        if(points.length<=1){
            return points.length;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int count=1;
        int shoot_begin=points[0][0];
        int shoot_end=points[0][1];

        for(int i=1;i<points.length;i++){
            if(points[i][0]>=shoot_begin&&points[i][0]<=shoot_end){
                shoot_begin=points[i][0];
                if(points[i][1]<shoot_end){
                    shoot_end=points[i][1];
                }
            }else{
                count++;
                shoot_begin=points[i][0];
                shoot_end=points[i][1];
            }
        }
        return count;

    }
}
