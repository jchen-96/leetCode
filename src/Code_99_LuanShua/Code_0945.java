package Code_99_LuanShua;

import java.util.Arrays;

public class Code_0945 {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int count=0;
        for(int i=1;i<A.length;i++){
            if (A[i]<=A[i-1]) {
                int diff=A[i-1]-A[i]+1;
                count+=diff;
                A[i]+=diff;
            }
        }
        return count;
    }
}
