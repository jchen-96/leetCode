package Code_99_HOT_100;


//https://leetcode-cn.com/problems/merge-intervals/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//重写比较器
public class Code_0056 {
    public int[][] merge(int[][] intervals) {
        if(intervals==null||intervals.length<=1)
            return intervals;
        List<List<Integer>> temp=new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int i=0;i<intervals.length;){
            int start=i;
            if(i+1<intervals.length&&intervals[i+1][0]<=intervals[i][1]){
                while (i+1<intervals.length&&intervals[i+1][0]<=intervals[start][1]){
                    intervals[start][1]=Math.max(intervals[i+1][1],intervals[start][1]);
                    i++;
                }
                i++;
            }else
                i++;
            temp.add(new ArrayList<>(Arrays.asList(intervals[start][0],intervals[start][1])));
        }
        int[][] res=new int[temp.size()][2];
        for(int i=0;i<res.length;i++){
            res[i][0]=temp.get(i).get(0);
            res[i][1]=temp.get(i).get(1);
        }
        return res;

    }
}
