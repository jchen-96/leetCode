package Code_01_arrayProblem;

import java.util.Arrays;


//too easy

public class Code_0977 {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);

        return A;
    }
}
