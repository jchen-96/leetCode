package Code_01_arrayProblem;

import java.util.Arrays;
import java.util.Comparator;

public class Code_1341 {
    public int[] kWeakestRows(int[][] mat, int k) {
        if(mat==null||mat.length<=0||k==0)
            return null;
        int[][] res=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int count=0;
            res[i][1]=i;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)
                    count++;
            }
            res[i][0]=count;
        }
        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0];
            }
        });
        int[] r=new int[k];
        for(int i=k-1;i>=0;i--){
            r[i]=res[i][1];
        }
        return r;
    }
}
